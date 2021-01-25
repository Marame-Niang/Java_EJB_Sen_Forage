package com.EJBSenForage.dao;

import java.util.List;

import javax.ejb.Remote;

import com.EJBSenForage.entities.Village;


@Remote
public interface IVillageRemote {
	public int add(Village village);
	public List<Village> list();
	public Village getVillageById(int id);
}
