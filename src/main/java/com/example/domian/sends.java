package com.example.domian;

import java.util.List;

public class sends {
    private List<email> emails;
    private String msg;
    private String mainly;
    private String pwd;
    private String count;

    @Override
    public String toString() {
        return "sends{" +
                "emails=" + emails +
                ", msg='" + msg + '\'' +
                ", mainly='" + mainly + '\'' +
                ", pwd='" + pwd + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    public void setEmails(List<email> emails) {
        this.emails = emails;
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

    public List<email> getEmails() {
        return emails;
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

    public sends(List<email> emails, String msg, String mainly, String pwd, String count) {
        this.emails = emails;
        this.msg = msg;
        this.mainly = mainly;
        this.pwd = pwd;
        this.count = count;
    }

    public sends() {
    }
}
