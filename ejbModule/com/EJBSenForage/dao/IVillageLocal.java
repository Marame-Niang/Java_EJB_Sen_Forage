package com.EJBSenForage.dao;

import java.util.List;

import javax.ejb.Local;

import com.EJBSenForage.entities.Village;


@Local
public interface IVillageLocal {
	public int add(Village village);
	public List<Village> list();
	public Village getVillageById(int id);
}
