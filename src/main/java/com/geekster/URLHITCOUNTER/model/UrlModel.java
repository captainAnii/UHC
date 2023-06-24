package com.geekster.URLHITCOUNTER.model;

public class UrlModel {

    private String username;
    private int count;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UrlModel(String username, int count){
        this.count = count;
        this.username=username;
    }

    @Override
    public String toString() {
        return "UrlModel{" +
                "username='" + username + '\'' +
                ", count=" + count +
                '}';
    }
}