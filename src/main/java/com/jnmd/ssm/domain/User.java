package com.jnmd.ssm.domain;

public class User {
    private int uid;

    private String username;

    private String password;

    private int age;

    public User() {
        super();
    }
    
    public User(String username, String password, int age) {
        super();
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public User(int uid, String username, String password, int age) {
        super();
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", age=" + age
                + "]";
    }
    
}
