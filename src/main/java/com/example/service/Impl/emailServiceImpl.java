package com.example.service.Impl;

import com.example.dao.emailDao;
import com.example.domian.Code;
import com.example.domian.ResultFromCode;
import com.example.domian.email;
import com.example.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.CacheableOperation;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.zip.GZIPOutputStream;

@Service
public class emailServiceImpl implements emailService {
    @Autowired
    private emailDao emailDao;
    private int code;
    private String message;
    @Override
    public ResultFromCode getAllGroupName() {
        List<String> emailGroup = emailDao.getEmailGroup();
        if (emailGroup.size()>=1){
            code = Code.GET_OK;
            message = "Success!";
        }else {
            code = Code.GET_FAIL;
            message = "find fail!";
            
        }
        return new ResultFromCode(code,emailGroup,message);
    }

    @Override
    public ResultFromCode getAllInfoByGroupName(String GroupName) {
        System.out.println(GroupName);
        List<email> allInfoByGroupName = emailDao.getAllInfoByGroupName(GroupName);
        if (allInfoByGroupName.size()>=1){
            code = Code.GET_OK;
            message = "Success!";
        }else {
            code = Code.GET_FAIL;
            message = "find fail!";
        }
        return new ResultFromCode(code,allInfoByGroupName,message);
    }

    @Override
    public ResultFromCode insertInfo(email email) {
        boolean b = emailDao.insertInfo(email);
        if (b) {
            code = Code.GET_OK;
            message = "Success!";
        } else {
            code = Code.GET_FAIL;
            message = "insert fail!";
        }
        return new ResultFromCode(code, b, message);
    }

    @Override
    public ResultFromCode getAll() {
        List<email> allInfo = emailDao.getAllInfo();
        if (allInfo.size()>=1 ) {
            code = Code.GET_OK;
            message = "Success!";
        } else {
            code = Code.GET_FAIL;
            message = "find fail!";
        }
        return new ResultFromCode(code, allInfo, message);
    }
}
