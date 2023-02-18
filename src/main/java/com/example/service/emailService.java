package com.example.service;

import com.example.domian.ResultFromCode;
import com.example.domian.email;

import java.util.List;

public interface emailService {
    /**
     * 查询所有的的群组名字
     * @return
     */
    public ResultFromCode getAllGroupName();

    /**
     * 查询所有在GroupName里的人的所有信息
     * @param GroupName
     * @return
     */
    public ResultFromCode getAllInfoByGroupName(String GroupName);

    /**
     * 插入信息
     * @param email
     * @return
     */
    public ResultFromCode insertInfo(email email);

    /**
     * 获取所有信息
     * @return
     */
    public ResultFromCode getAll();
}
