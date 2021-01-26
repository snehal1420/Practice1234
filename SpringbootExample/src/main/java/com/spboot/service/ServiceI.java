package com.spboot.service;

import java.util.List;

import com.spboot.model.User;

public interface ServiceI 
{
public void addUser(User usr) ;

public List<User> logincheck(String uname,String pass);

public User deleteRcord(int id);

public User editdata(User usr);

}
