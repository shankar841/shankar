package demo10;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass10 {

	public static void main(String[] args)
	{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	//test10 t1=new test10();
	//t1.setId(2);
    //t1.setName("abc");
    //t1.setAge("56");
    test10 e=entityManager.find(test10.class,1);
  //  e.setName("anil");
    System.out.println(e);
   // entityTransaction.begin();
   // entityManager.persist(e);
   // entityTransaction.commit();
    
	}

}
