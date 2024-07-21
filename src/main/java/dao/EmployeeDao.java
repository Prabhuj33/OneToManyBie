package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Employee;

public class EmployeeDao {

	EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("prabhu").createEntityManager();
	}

	
	public void updateEmployee(int id,Employee employee)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee dbEmployee=em.find(Employee.class,id);
		if(dbEmployee!=null)
		{
			et.begin();
			employee.setId(id);
			employee.setCompany(dbEmployee.getCompany());
			em.merge(employee);
			et.commit();
		}
	}
	
}



