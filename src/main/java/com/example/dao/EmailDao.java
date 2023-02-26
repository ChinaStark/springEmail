package com.example.dao;

import com.example.domian.EmailDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmailDao {


    @Select("select * from data_email;")
    List<EmailDO> getAllInfo();
    /*查询群组id*/
    @Select("select My_group from data_email group by My_group ;")
    List<String> getEmailGroup();
    @Select("select * from data_email where My_group = #{name};")
    List<EmailDO> getAllInfoByGroupName(String GroupName);
    /*Add*/
    @Insert("insert into data_email values (null,#{Email_number},#{friend_name},#{My_group},#{extends_grid});")
    boolean insertInfo(EmailDO emailDO);
}
