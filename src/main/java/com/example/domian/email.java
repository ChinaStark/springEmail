package com.example.domian;

public class
email {
    private int id;
    private String Email_number;
    private String friend_name;
    private String My_group;
    private String extends_grid;

    public email() {
    }

    public email(String email_number, String friend_name, String my_group, String extends_grid) {
        Email_number = email_number;
        this.friend_name = friend_name;
        My_group = my_group;
        this.extends_grid = extends_grid;
    }

    @Override
    public String toString() {
        return "email{" +
                "id=" + id +
                ", Email_number='" + Email_number + '\'' +
                ", friend_name='" + friend_name + '\'' +
                ", My_group='" + My_group + '\'' +
                ", extends_grid='" + extends_grid + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail_number(String email_number) {
        Email_number = email_number;
    }

    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    public void setMy_group(String my_group) {
        My_group = my_group;
    }

    public void setExtends_grid(String extends_grid) {
        this.extends_grid = extends_grid;
    }

    public int getId() {
        return id;
    }

    public String getEmail_number() {
        return Email_number;
    }

    public String getFriend_name() {
        return friend_name;
    }

    public String getMy_group() {
        return My_group;
    }

    public String getExtends_grid() {
        return extends_grid;
    }
}
