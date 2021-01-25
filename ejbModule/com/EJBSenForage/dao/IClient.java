package com.EJBSenForage.dao;
import java.util.List;

import com.EJBSenForage.entities.Client;
public interface IClient {
	public int add(Client client);
	public List<Client> list();
}
