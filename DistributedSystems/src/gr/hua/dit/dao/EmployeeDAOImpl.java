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

}

