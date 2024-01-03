package com.kanti.hiber;
// import com.kanti.hiber.*;
import org.hibernate.Session;

public class TestEmployee {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open the session 
				Session session = HibernateUtil.getSessionFactory().openSession(); 

				// For doing any CRUD operation, 
				// let us start a transaction 
				session.beginTransaction(); 
				Employee e=new Employee();
				e.setId(100);
				e.setName("Kavya");
				e.setSalary(25000.45);
				
				session.save(e); 

				// commit will help to complete 
				// the changes in the table 
				session.getTransaction().commit(); 

				// close the session 
				session.close();
	}

}
