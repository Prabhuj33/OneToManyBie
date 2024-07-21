package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Company;
import dto.Employee;

public class CompanyDao {

	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("prabhu").createEntityManager();
	}
	
	public void updateCompany(int id,Company company)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		Company dbCompany=em.find(Company.class,id);
		if(dbCompany!=null)
		{
			et.begin();
			
			company.setId(id);
			company.setEmployee(dbCompany.getEmployee());
			
			em.merge(company);
			et.commit();
		}
		else 
		{
			System.out.println("sorry id is not present");
		}
	}
	
	
	public void deleteCompany(int id)
	{
		EntityManager em=getEntityManager();
		Company dbCompany=em.find(Company.class,id);
		EntityTransaction et=em.getTransaction();
		et.begin();
		
//		List<Employee>employees=dbCompany.getEmployee();
		if(dbCompany!=null)
		{
//		for(Employee employee:employees)
//		{
//			employee.setCompany(null);
//		}
		em.remove(dbCompany);
		et.commit();
	}
		else 
		{
			System.out.println("sorry id is not present");
		}
	}

	
	
	public void findCompany(int id)
	{
		EntityManager em=getEntityManager();
		
		Company dbCompany=em.find(Company.class,id );
		if(dbCompany!=null)
		{
			System.out.println(dbCompany);
		}
		else 
		{
			System.out.println("sorry id is not be present");
		}
	}
	
	
}
