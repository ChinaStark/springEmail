package com.example.service;

import com.example.domian.EmailDO;
import com.example.domian.ResultCodeDTO;

public interface emailService {
    /**
     * 查询所有的的群组名字
     * @return
     */
    public ResultCodeDTO getAllGroupName();

    /**
     * 查询所有在GroupName里的人的所有信息
     * @param GroupName
     * @return
     */
    public ResultCodeDTO getAllInfoByGroupName(String GroupName);

    /**
     * 插入信息
     * @param emailDO
     * @return
     */
    public ResultCodeDTO insertInfo(EmailDO emailDO);

    /**
     * 获取所有信息
     * @return
     */
    public ResultCodeDTO getAll();
}
