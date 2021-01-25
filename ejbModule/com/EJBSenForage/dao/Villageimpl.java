package com.EJBSenForage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.EJBSenForage.entities.Village;



@Stateless
public class Villageimpl implements IVillageLocal, IVillageRemote{

	@PersistenceContext(unitName = "EJBSenForagePU")
	private EntityManager em;
	
	@Override
	public int add(Village village) {
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			return 1;
		} catch (Exception ex) {
			return 0;
		}
		
	}

	@Override
	public List<Village> list() {
	
		return em.createQuery("select v from Village v", Village.class).getResultList();
	}

	@Override
	public Village getVillageById(int id) {
		Village village = em.find(Village.class, id);
		return village;
	}
	
	
}
