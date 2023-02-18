package com.example.controller;

import com.example.configDomain.MailProperties;
import com.example.domian.Code;
import com.example.domian.ResultFromCode;
import com.example.domian.email;
import com.example.domian.sends;
import com.example.service.Impl.emailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/email")
public class emailController {
    @Autowired
    private emailServiceImpl emailService;

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @GetMapping("/all")
    public ResultFromCode getAll(){
        return emailService.getAll();
    }
    /**
     * 获取所有GroupName
     * @return
     */
    @GetMapping
    public ResultFromCode getGroupName(){
        return emailService.getAllGroupName();
    }

    /**
     * 获取GroupName中所有人的信息
     * @param GroupName
     * @return
     */

    @GetMapping("/{GroupName}")
    public ResultFromCode getAllInfoGroupName(@PathVariable String GroupName){
        return emailService.getAllInfoByGroupName(GroupName);
    }

    @PostMapping
    public ResultFromCode insertInfo(@RequestBody email email){
        System.out.println(email);
        return emailService.insertInfo(email);

    }

    /**
     * 需要的参数有发送的群组的名字，发送的信息，发送的主题都在sends里面封装完成
     * @param sends
     * @return
     */
    @PostMapping("/send")
    public ResultFromCode sendEmail(@RequestBody sends sends){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("longzl202109@163.com");
//        ResultFromCode allInfoByGroupName = emailService.getAllInfoByGroupName(sends.getName());
        String mainly = sends.getMainly();
        String message = sends.getMsg();
//        List<email> data = (List<email>) allInfoByGroupName.getData();
        System.out.println(sends);
        for (email email : sends.getEmails()) {
            String email_number = email.getEmail_number();
            simpleMailMessage.setTo(email_number);
            simpleMailMessage.setSubject(mainly);
            simpleMailMessage.setText(message);
            javaMailSender.setPassword(sends.getPwd());
            javaMailSender.send(simpleMailMessage);
            System.out.println(simpleMailMessage);
        }
        return new ResultFromCode(Code.INSERT_OK,null,"发送完毕");
    }

}