package com.c.w.fourteen;

import java.io.Serializable;

public class Student implements Serializable {

    String uid;
    String username;
    String password;
    Integer cid;
    Integer chinese;
    Integer math;
    Integer english;

    public Student() {
        super();
    }

    public Student(String uid, String username, String password) {
        super();
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public Student(String uid, String username, String password, Integer cid, Integer chinese, Integer math, Integer english) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.cid = cid;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }
}
