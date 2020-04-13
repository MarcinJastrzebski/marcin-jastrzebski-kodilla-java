package com.kodilla.good.patterns.challanges.food2door;

public class SimpleUser implements User {
    private String username;
    private String realName;
    private String email;

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getRealName() {
        return realName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
