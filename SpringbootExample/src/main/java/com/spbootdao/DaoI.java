package com.spbootdao;
 
import java.util.List;

import com.spboot.model.User;

public interface DaoI {
	public void addUser(User usr) ;

	public List<User> logincheck(String uname,String pass);

	public User deleteRcord(int id);

	public User editdata(User usr);

}
