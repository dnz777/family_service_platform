package com.mashibing.returnJSON;

public class UserInfo {
    private String userName;
    private String avatar = "/avatar2.jpg";
    private Permissions role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setRole(Permissions role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public Permissions getRole() {
        return role;
    }

    public UserInfo() {
    }

    public UserInfo(String userName, Permissions role) {
        this.userName = userName;
        this.role = role;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                '}';
    }
}
