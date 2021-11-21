package com.lti.HibernateApp1;
 

import java.util.List;

import com.lti.hiber.dao.ProfileDAO;
import com.lti.hiber.pojo.profile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // profile pf=new profile(2019, "sheema","heb","chennai");
    	
         ProfileDAO dao=new ProfileDAO();
         List<profile> res=dao.getAllPersons();
         for(profile p : res)
         {
        	 System.out.println(p);
         }
        // dao.deletePerson(2019);
         //dao.saveProfile(pf);
         //dao.updateprofile(pf);
         //profile prof=dao.searchByIdno(2009);
       //  if(prof!=null)
         /*{
        	 System.out.println(prof);
         }
         else
        	 System.out.println("Person Not Found!");
    }*/
}
}
