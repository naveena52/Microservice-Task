package com.Quess.Microservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("numbers")
public class numberconfiguration {
    public numberconfiguration() {

    }

    private float max_num;
    private float min_num;

    public numberconfiguration(float max_num, float min_num) {
        this.max_num = max_num;
        this.min_num = min_num;
    }

    public float getMax_num() {
        return max_num;
    }

    public void setMax_num(float max_num) {
        this.max_num = max_num;

    }

    public float getMin_num() {
        return min_num;
    }

    public void setMin_num(float min_num) {
        this.min_num = min_num;
    }
}