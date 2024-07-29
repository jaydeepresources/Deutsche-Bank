package com.example.demo;

public class Engine {

    private int capacity;
    private String name;

    Engine(){

    }

    public Engine(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                '}';
    }
}
