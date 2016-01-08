package com.tuoppi.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {
    
    private int id;
    private String foo;

    public Test() {
    }

    @Id @GeneratedValue
    public int getId() {
        return id;
    }

    public String getFoo() {
        return foo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
    
}