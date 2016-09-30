package com.example.superuser.hometask1.model;

/**
 * Created by SuperUser on 17.09.2016.
 */
public class Person
{
    private String mName;

    public Person(String mName) {
        this.mName = mName;
    }

    public Person() {

    }

    public String getmName() {
        return mName;
    }

    public Person setmName(String mName) {
        this.mName = mName;
        return this;
    }

}
