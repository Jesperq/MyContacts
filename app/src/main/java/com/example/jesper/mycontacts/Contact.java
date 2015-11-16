package com.example.jesper.mycontacts;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Jesper on 9/22/2015.
 */
public class Contact implements Serializable{

    private String mName;
    public ArrayList<String> emails;
    public ArrayList<String> phoneNumbers;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
