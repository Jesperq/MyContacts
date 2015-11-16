package com.example.jesper.mycontacts;

import java.util.ArrayList;

/**
 * Created by Jesper on 2015-10-17.
 */
public class ContactList extends ArrayList<Contact>{

    private static ContactList sInstance = null;

    private ContactList(){}

    public static ContactList getInstance(){
        if(sInstance == null){
            sInstance = new ContactList();
        }
        return sInstance;
    }

}
