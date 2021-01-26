package com.spboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spboot.model.User;
import com.spbootdao.DaoI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private DaoI d;
	
	@Override
	public void addUser(User usr) {
	d.addUser(usr);
		
	}

	@Override
	public List<User> logincheck(String uname, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteRcord(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User editdata(User usr) {
		// TODO Auto-generated method stub
		return null;
	}

}
