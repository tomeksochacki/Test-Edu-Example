package com.test.math.example;

public class Customer {

    public Customer(String name){
        this.name = name;
        nextId = nextId + 1;
        id = nextId;

        numberCustomer = numberCustomer + 1;
        numberCustom = numberCustomer;
    }

    public String name;
    public int id = 0;
    public static int nextId = 0;

    public int numberCustom = 0;
    public static int numberCustomer = 0;

}
