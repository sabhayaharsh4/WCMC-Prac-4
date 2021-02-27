package com.example.practical4;

import androidx.annotation.NonNull;

import java.io.PushbackInputStream;
import java.util.ArrayList;

import java.util.List;


public class Data {

    private static List<Users> users = new ArrayList<Users>();

    static public void addUser(Users user){
        users.add(user);
    }

    public static String toStringData(){
        String str = "";
        for(Users user: users){
            str += user;
        }
        return str;
    }

    static public boolean checkUserCredentials(final String userEmail, final String userPassword){
        boolean flag = false;
        for(Users user : users){
            if(user.getEmail().equals(userEmail) && user.getPassword().equals(userPassword)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    static public boolean checkUser(final String email){
        boolean flag = false;
        for(Users user : users){
            if(user.getEmail().equals(email)){
                flag = true;
                break;
            }
        }

        return flag;
    }
}
