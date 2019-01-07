package com.rest.demo.Model;

public class AppendA {
    private char append;
    private String appended;

    public AppendA(String appended) {
        append = 'a';
        this.appended = appended + append;
    }

    public char getAppend() {
        return append;
    }

    public void setAppend(char append) {
        this.append = append;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
