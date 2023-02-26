package com.example.controller;

import com.example.domian.EmailDO;
import com.example.domian.StateCodeDO;
import com.example.domian.ResultCodeDTO;
import com.example.domian.SendBO;
import com.example.service.Impl.emailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/EmailDO")
public class EmailController {
    @Autowired
    private emailServiceImpl emailService;

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @GetMapping("/all")
    public ResultCodeDTO getAll(){
        return emailService.getAll();
    }
    /**
     * 获取所有GroupName
     * @return
     */
    @GetMapping
    public ResultCodeDTO getGroupName(){
        return emailService.getAllGroupName();
    }

    /**
     * 获取GroupName中所有人的信息
     * @param GroupName
     * @return
     */

    @GetMapping("/{GroupName}")
    public ResultCodeDTO getAllInfoGroupName(@PathVariable String GroupName){
        return emailService.getAllInfoByGroupName(GroupName);
    }

    @PostMapping
    public ResultCodeDTO insertInfo(@RequestBody EmailDO emailDO){
        System.out.println(emailDO);
        return emailService.insertInfo(emailDO);

    }

    /**
     * 需要的参数有发送的群组的名字，发送的信息，发送的主题都在sends里面封装完成
     * @param SendBO
     * @return
     */
    @PostMapping("/send")
    public ResultCodeDTO sendEmail(@RequestBody SendBO SendBO){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("longzl202109@163.com");
//        ResultFromCode allInfoByGroupName = emailService.getAllInfoByGroupName(sends.getName());
        String mainly = SendBO.getMainly();
        String message = SendBO.getMsg();
//        List<email> data = (List<email>) allInfoByGroupName.getData();
        System.out.println(SendBO);
        for (EmailDO emailDO : SendBO.getEmails()) {
            String email_number = emailDO.getEmail_number();
            simpleMailMessage.setTo(email_number);
            simpleMailMessage.setSubject(mainly);
            simpleMailMessage.setText(message);
            javaMailSender.setPassword(SendBO.getPwd());
            javaMailSender.send(simpleMailMessage);
            System.out.println(simpleMailMessage);
        }
        return new ResultCodeDTO(StateCodeDO.INSERT_OK,null,"发送完毕");
    }

}