package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.CompanyDao;
import dao.EmployeeDao;
import dto.Company;
import dto.Employee;

public class CompanyEmployeeControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Company c=new Company();
//		c.setId(2);
//		c.setName("AZAUS");
//		c.setGst(100000);
//		
//		Employee e=new Employee();
//		e.setId(201);
//		e.setName("Kanmani");
//		e.setAddress("lakno");
//		
//		Employee e1=new Employee();
//		e1.setId(202);
//		e1.setName("Janu");
//		e1.setAddress("Kerala");
//		
//		
//		List<Employee> emp=new ArrayList<Employee>();
//		emp.add(e);
//		emp.add(e1);
//		
//		
//		c.setEmployee(emp);
//		
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		et.begin();
//		em.persist(e);
//		em.persist(e1);
//		em.persist(c);
//		et.commit();
		
//		Company c=new Company();
//		c.setId(1);
//		c.setName("Lenova");
//		c.setGst(2000);
//		
//		CompanyDao co=new CompanyDao();
//		co.updateCompany(1, c);
//		
//		Employee e=new Employee();
//		e.setId(101);
//		e.setName("Raj");
//		e.setAddress("landan");
//		
//		EmployeeDao eo=new EmployeeDao();
//		eo.updateEmployee(101, e);
//		
		
		
		
		CompanyDao d=new CompanyDao();
		d.deleteCompany(1);
		
		
	}

}
