package com.fzw.springabc.no002_bean作用范围;

import lombok.ToString;

@ToString
public class Employee {
    private String name;
    private Car car;
    
    public Employee() {
    }
    
    public Employee(String name, Car car) {
        super();
        this.name = name;
        this.car = car;
    }
    
    public String name() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Car car() {
        return car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }
    
}
