package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
        //r.name = "mihir";
        //java: name has private access in com.driver.RWOnly
        r.setName("mihir");
        System.out.println(r.getName());
    }
}