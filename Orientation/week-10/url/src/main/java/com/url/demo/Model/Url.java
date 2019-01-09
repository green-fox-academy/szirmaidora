package com.url.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String inputAlias;
    String intputUrl;

    public Url() {
    }
    public Url(String intputUrl, String inputAlias) {
        this.intputUrl = intputUrl;
        this.inputAlias = inputAlias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntputUrl() {
        return intputUrl;
    }

    public void setIntputUrl(String intputUrl) {
        this.intputUrl = intputUrl;
    }

    public String getInputAlias() {
        return inputAlias;
    }

    public void setInputAlias(String inputAlias) {
        this.inputAlias = inputAlias;
    }
}
