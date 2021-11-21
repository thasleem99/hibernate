package com.lti.hiber.dao;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.hiber.pojo.profile;

public class ProfileDAO 
{
	public void saveProfile(profile profile) 
	{
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		eMan.getTransaction().begin();
		eMan.persist(profile);
		eMan.getTransaction().commit();
		eMan.close();
		emFac.close();
		System.out.println("profile saved.....");
			
	}
	public void updateprofile(profile profile) 
	{
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		eMan.getTransaction().begin();
		eMan.merge(profile);
		eMan.getTransaction().commit();
		eMan.close();
		emFac.close();
		System.out.println("profile updated.....");
			
	}
	public profile searchByIdno(int idno) 
	{
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		
		profile prf=eMan.find(profile.class,idno);
		System.out.println(prf);
		return prf;
		
	}
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		eMan.getTransaction().begin();
		profile p=eMan.find(profile.class, id);
		eMan.remove(p);
		eMan.getTransaction().commit();
		System.out.println("profile deleted");
	}
	public List<profile> getAllPersons()
	{
		EntityManagerFactory emFac=Persistence.createEntityManagerFactory("MyDB");
		EntityManager eMan=emFac.createEntityManager();
		
		Query qry=eMan.createQuery("from profile");
		List<profile> profs=qry.getResultList();
		return profs;
	}
	 
	}
	 
	 

