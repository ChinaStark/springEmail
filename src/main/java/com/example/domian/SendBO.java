package com.example.domian;

import java.util.List;

public class SendBO {
    private List<EmailDO> EmailDOS;
    private String msg;
    private String mainly;
    private String pwd;
    private String count;

    @Override
    public String toString() {
        return "sends{" +
                "emails=" + EmailDOS +
                ", msg='" + msg + '\'' +
                ", mainly='" + mainly + '\'' +
                ", pwd='" + pwd + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    public void setEmails(List<EmailDO> EmailDOS) {
        this.EmailDOS = EmailDOS;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setMainly(String mainly) {
        this.mainly = mainly;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<EmailDO> getEmails() {
        return EmailDOS;
    }

    public String getMsg() {
        return msg;
    }

    public String getMainly() {
        return mainly;
    }

    public String getPwd() {
        return pwd;
    }

    public String getCount() {
        return count;
    }

    public SendBO(List<EmailDO> EmailDOS, String msg, String mainly, String pwd, String count) {
        this.EmailDOS = EmailDOS;
        this.msg = msg;
        this.mainly = mainly;
        this.pwd = pwd;
        this.count = count;
    }

    public SendBO() {
    }
}
