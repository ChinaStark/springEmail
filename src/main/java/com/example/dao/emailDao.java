package com.example.dao;

import com.example.domian.email;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface emailDao {

    @Select("select * from data_email;")
    List<email> getAllInfo();
    /*查询群组id*/
    @Select("select My_group from data_email group by My_group ;")
    List<String> getEmailGroup();
    @Select("select * from data_email where My_group = #{name};")
    List<email> getAllInfoByGroupName(String GroupName);
    /*Add*/
    @Insert("insert into data_email values (null,#{Email_number},#{friend_name},#{My_group},#{extends_grid});")
    boolean insertInfo(email email);
}
