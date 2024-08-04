package com.knight.librarybase;

import java.io.Serializable;

/**
 * description:
 * author: Knight
 * new date: 2024/8/4 on 19:10
 * e-mail: 37442216knight@gmail.com
 * update: 2024/8/4 on 19:10
 * version: v 1.0
 */
public class User implements Serializable {
    private String userName;
    private String age;

    public User() {
    }

    public User(String userName, String age) {
        this.userName = userName;
        this.age = age;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
