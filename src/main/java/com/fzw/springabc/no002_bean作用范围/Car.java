package com.fzw.springabc.no002_bean作用范围;

public class Car {
    
    private String name;
    
    private Double price;
    
    public Car() {
    }
    
    public Car(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }
    
    public String name() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double price() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Car [name=" + name + ", price=" + price + "]";
    }
}
