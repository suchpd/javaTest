package com.test.demo.entity;

public class TestModel {
    private String name;
    private int id;
    private String gender;

    public TestModel(){

    }

    public TestModel(String name,int id,String gender){
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
