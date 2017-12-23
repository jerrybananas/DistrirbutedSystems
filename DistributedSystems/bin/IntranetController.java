package gr.hua.dit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.entity.Employee;
import gr.hua.dit.service.EmployeeService;

@Controller
@RequestMapping("/index")
public class IntranetController {
	
	// inject the customer service
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public String listEemployees(Model model) {
		
		// get customers from the service
		List<Employee> employees = employeeService.getEmployees();
		
		// add the customers to the model
		model.addAttribute("employeess",employees);
		
		// add page title
		model.addAttribute("pageTitle", "List Employees");
		return "list-employees";
	}
	
	@GetMapping("/{id}")
	public String getEmployee(Model model, @PathVariable("id") int id) {
		// get the customer
		Employee employee = employeeService.getEmployee(id);
		
		model.addAttribute("employee", employee);
		
		return "employee-form";
	}
	
	@GetMapping("/showAddForm")
	public String showAddForm(Model model) {
		// create model attribute to get form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		// add page title
		model.addAttribute("pageTitle", "Add Employee");
		return "employee-form";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		// save the employee using the service
		employeeService.saveEmployee(employee);
		
		return "redirect:/employee/list";
	}

}
