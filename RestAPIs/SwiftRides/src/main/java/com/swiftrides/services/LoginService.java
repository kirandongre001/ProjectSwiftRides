package com.swiftrides.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.Login;
import com.swiftrides.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository lrepo;
	
	public Login getLogin(String login_id,String password)
	{
		Login l;
		Optional<Login> ol=lrepo.getLogin(login_id, password);
		try
		{
			l=ol.get();
		}
		catch(Exception e)
		{
			l=null;
		}
		return l;
	}
	
	public Login getById(int login_id)
	{
		return lrepo.findById(login_id).get();
	}
	
	public Login save(Login l)
	{
		return lrepo.save(l);
	}
	
	public int updateStatus(Boolean status,int id)
	{
		return lrepo.updateStatus(status, id);
	}
}
