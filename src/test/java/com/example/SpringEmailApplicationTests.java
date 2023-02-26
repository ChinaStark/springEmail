package com.example;

import com.example.dao.EmailDao;
import com.example.domian.EmailDO;
import com.example.domian.ResultCodeDTO;
import com.example.service.Impl.emailServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringEmailApplicationTests {
    @Autowired
    private emailServiceImpl emailService;
    @Autowired
    private EmailDao emailDao;
    @Test
    void getGroupName() {
        List<String> emailGroup = emailDao.getEmailGroup();
        System.out.println(emailGroup);
    }

    @Test
    void getAllInfoByGroupName(){
        List<EmailDO> me = emailDao.getAllInfoByGroupName("me");
        System.out.println(me);
    }
    @Test
    public void serviceTest(){
        ResultCodeDTO me = emailService.getAllInfoByGroupName("me");
        List<EmailDO> data = (List<EmailDO>) me.getData();
        System.out.println(data.get(1).getEmail_number());
        for (EmailDO emailDO : data) {
            String email_number = emailDO.getEmail_number();
            System.out.println(email_number);
        }
    }
//    TODO all test are pass!!!
//    @Test
//    public void serviceTest01(){
//        ResultFromCode me = emailService.getAllGroupName();
//        System.out.println(me);
//    }
//    @Test
//    public void insertTest(){
//        ResultFromCode resultFromCode = emailService.insertInfo(new email("1927173617@qq.com", "张春阳", "GoodFriend", null));
//        System.out.println(resultFromCode);
//    }
//    @Test
//    public void getAll(){
//        ResultFromCode all = emailService.getAll();
//        System.out.println(all);
//    }
//    @Test
//    public void propertiesTest(){
//        MailProperties mailProperties = new MailProperties();
//        mailProperties.setPassword("12345678");
//    }

}
