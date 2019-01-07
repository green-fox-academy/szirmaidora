package com.rest.demo.Model;

public class DoUntil {
    private Integer until;

    public DoUntil(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public DoUntil sum(Integer until) {
        Integer sum = 0;
        for (int i = 1; i < until; i++) {
            sum += i;
        }
        return new DoUntil(sum);
    }

    public DoUntil factor(Integer until) {
        Integer factor = 1;
        for (int i = 1; i < until; i++) {
            factor *= i;
        }
        return new DoUntil(factor);
    }
}
