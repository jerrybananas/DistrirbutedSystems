package gr.hua.dit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
        // inject the session factory
        @Autowired
        private SessionFactory sessionFactory;
        
        @Override
        @Transactional
        public List<Employee> getEmployees() {
                // get current hibernate session
                Session currentSession = sessionFactory.getCurrentSession();
                
                // create a query
                Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
                
                
                // execute the query and get the results list
                List<Employee> employees = query.getResultList();
                                
                //return the results
                return employees;
        }
        
        
        
        @Override
    	public void saveEmployee(Employee employee) {
    		// get current hibernate session
    		Session currentSession = sessionFactory.getCurrentSession();
    		
    		// save the customer
    		currentSession.save(employee);
    		
    	}

    	@Override
    	public Employee getEmployee(int id) {
    		// get current hibernate session
    		Session currentSession = sessionFactory.getCurrentSession();
    		
    		//get and return Customer
    		Employee employee = currentSession.get(Employee.class, id);
    		return employee;
    	}

    	@Override
    	public void deleteEmployee(int id) {
    		
    		// get current hibernate session
    		Session currentSession = sessionFactory.getCurrentSession();
    		
    		// find the customer
    		Employee employee = currentSession.get(Employee.class, id);

    		
    		// delete customer
    		currentSession.delete(employee);
    	}
        
        
        

}

