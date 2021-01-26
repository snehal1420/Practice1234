package com.spbootdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spboot.model.User;
@Repository
public class DaoImpl implements DaoI{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addUser(User usr) {
		Session session=sf.openSession();
		session.save(usr);
		session.beginTransaction().commit();
		System.out.println("Data Inserted Successfully");
		
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
