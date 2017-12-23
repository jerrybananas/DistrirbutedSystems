package gr.hua.dit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import gr.hua.dit.dao.EmployeeDAO;
import gr.hua.dit.entity.Employee;

public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDOA;
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDOA.getEmployees();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDOA.saveEmployee(employee);
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDOA.getEmployee(id);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDOA.deleteEmployee(id);
	}

}
