package com.company;

import java.lang.Cloneable;


public class Student <a,b,c,d> implements Cloneable{

    public a usercode ;
    public b username ;
    public c userpass ;
    public d list;

    public Student(){}

    @Override

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
