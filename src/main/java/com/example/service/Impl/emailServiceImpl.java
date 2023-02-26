package com.example.service.Impl;

import com.example.dao.EmailDao;
import com.example.domian.EmailDO;
import com.example.domian.StateCodeDO;
import com.example.domian.ResultCodeDTO;
import com.example.service.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class emailServiceImpl implements emailService {
    @Autowired
    private EmailDao emailDao;
    private int code;
    private String message;
    @Override
    public ResultCodeDTO getAllGroupName() {
        List<String> emailGroup = emailDao.getEmailGroup();
        if (emailGroup.size()>=1){
            code = StateCodeDO.GET_OK;
            message = "Success!";
        }else {
            code = StateCodeDO.GET_FAIL;
            message = "find fail!";
            
        }
        return new ResultCodeDTO(code,emailGroup,message);
    }

    @Override
    public ResultCodeDTO getAllInfoByGroupName(String GroupName) {
        System.out.println(GroupName);
        List<EmailDO> allInfoByGroupName = emailDao.getAllInfoByGroupName(GroupName);
        if (allInfoByGroupName.size()>=1){
            code = StateCodeDO.GET_OK;
            message = "Success!";
        }else {
            code = StateCodeDO.GET_FAIL;
            message = "find fail!";
        }
        return new ResultCodeDTO(code,allInfoByGroupName,message);
    }

    @Override
    public ResultCodeDTO insertInfo(EmailDO emailDO) {
        boolean b = emailDao.insertInfo(emailDO);
        if (b) {
            code = StateCodeDO.GET_OK;
            message = "Success!";
        } else {
            code = StateCodeDO.GET_FAIL;
            message = "insert fail!";
        }
        return new ResultCodeDTO(code, b, message);
    }

    @Override
    public ResultCodeDTO getAll() {
        List<EmailDO> allInfo = emailDao.getAllInfo();
        if (allInfo.size()>=1 ) {
            code = StateCodeDO.GET_OK;
            message = "Success!";
        } else {
            code = StateCodeDO.GET_FAIL;
            message = "find fail!";
        }
        return new ResultCodeDTO(code, allInfo, message);
    }
}
