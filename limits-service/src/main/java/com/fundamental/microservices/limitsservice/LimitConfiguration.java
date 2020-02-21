package com.fundamental.microservices.limitsservice;

public class LimitConfiguration {

    private int maximum;
    private int minimun;

    protected LimitConfiguration() {
    }

    public LimitConfiguration(int maximum, int minimun) {
        super();
        this.maximum = maximum;
        this.minimun = minimun;
    }



    public int getMaximum() {
        return maximum;
    }

    public int getMinimun() {
        return minimun;
    }
}
