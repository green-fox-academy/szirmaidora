package com.rest.demo.Model;

public class Doubling {
    private Integer received;
    private Integer result;

    public Doubling(int received) {
        this.received = received;
        result = received * 2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
