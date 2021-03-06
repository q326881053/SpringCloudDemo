package com.c.w.fourteen;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    String uid;
    String username;
    String password;

    public User() {
        super();
    }

    public User(String uid, String username, String password) {
        super();
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
}
