package com.wang.movie.pojo;

/**
 * @author 王一宁
 * @date 2020/2/2 10:11
 */
public class User {
    private int id;
    private int user_age;
    private int user_flag;
    private String user_name;
    private String user_password;
    private String user_realName;
    private String user_tel;
    private String user_email;
    private String user_sex;
    private String user_qq;
    private String user_img;

    public User() {
    }

    public User(int id, int user_age, int user_flag, String user_name, String user_password, String user_realName, String user_tel, String user_email, String user_sex, String user_qq, String user_img) {
        this.id = id;
        this.user_age = user_age;
        this.user_flag = user_flag;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_realName = user_realName;
        this.user_tel = user_tel;
        this.user_email = user_email;
        this.user_sex = user_sex;
        this.user_qq = user_qq;
        this.user_img = user_img;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_age=" + user_age +
                ", user_flag=" + user_flag +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_realName='" + user_realName + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_qq='" + user_qq + '\'' +
                ", user_img='" + user_img + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public int getUser_flag() {
        return user_flag;
    }

    public void setUser_flag(int user_flag) {
        this.user_flag = user_flag;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_realName() {
        return user_realName;
    }

    public void setUser_realName(String user_realName) {
        this.user_realName = user_realName;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }
}
