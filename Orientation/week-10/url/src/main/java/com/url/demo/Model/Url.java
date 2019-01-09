package com.url.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Url {
    @Id
    @NotNull
    @NotEmpty
    private String inputAlias;
    @NotNull
    @NotEmpty
    private String intputUrl;
    @JsonIgnore
    private String secretCode;
    private Integer hitCount;

    public Url() {
        hitCount = 0;
    }
    public Url(String intputUrl, String inputAlias) {
        this();
        this.intputUrl = intputUrl;
        this.inputAlias = inputAlias;
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

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public Integer getHitCount() {
        return hitCount;
    }

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }
}
