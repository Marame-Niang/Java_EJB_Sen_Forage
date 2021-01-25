package com.EJBSenForage.dao;

import com.EJBSenForage.entities.User;

public interface IUser {
	public User getAll(String  username, String password);

	User getAll(String username);
}
