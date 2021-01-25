package com.EJBSenForage.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length=150)
	private String nomUtilisateur;
	@Column(nullable = false, length=150)
	private String motdepasse;
	
	
	public User() {
		super();
	}
	public User(int id, String nomUtilisateur, String motdepasse) {
		super();
		this.id = id;
		this.nomUtilisateur = nomUtilisateur;
		this.motdepasse = motdepasse;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getMotdepasse() {
		return motdepasse;
	}
	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}
   
}
