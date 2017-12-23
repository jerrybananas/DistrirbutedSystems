package gr.hua.dit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gr.hua.dit.dao.EmployeeDAO;
import gr.hua.dit.entity.Employee;
import gr.hua.dit.service.EmployeeService;

@Controller
@RequestMapping("/")
public class MainController {

	// inject the customer dao
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	private EmployeeService employeeService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}

	@RequestMapping(value = "/checking", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> reqPar) {

		String idstr = reqPar.get("id");
		int id = Integer.parseInt(idstr);
		String password = reqPar.get("password");
		String role = "nothing";

		List<Employee> employees = employeeDAO.getEmployees();

		int searchListLength = employees.size();
		for (int i = 0; i < searchListLength; i++) {
			if (employees.get(i).getId() == id) {
				if (employees.get(i).getPassword().equals(password)) {
					role = employees.get(i).getRole();
					break;
				}
			}
		}
		System.out.println(employees.get(6).getName());
		ModelAndView model = new ModelAndView("retry");

		if (role.equals("admin")) {
			model = new ModelAndView("admin");
		} else if (role.equals("mechanic")) {
			model = new ModelAndView("mechanic");
		} else if (role.equals("employee")) {
			model = new ModelAndView("employee");
		}

		/*
		 * ModelAndView model = new ModelAndView("login"); if (password.equals("qwer"))
		 * { model = new ModelAndView("list-employees"); }
		 */

		return model;
	}

	@GetMapping("list")
	public String listEmployees(Model model) {

		// get customers from dao
		List<Employee> employees = employeeDAO.getEmployees();

		// add the customers to the model
		model.addAttribute("employees", employees);

		System.out.println(employees);

		return "list-employees";
	}

	// ADMIN~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ADMIN/NEW

	@RequestMapping(value = "/admin/newuser", method = RequestMethod.GET)
	public ModelAndView adminNew() {

		ModelAndView model = new ModelAndView("adminnew");
		return model;
	}

	/*@RequestMapping(value = "/newemp", method = RequestMethod.POST)
	public ModelAndView submitAdminNew(@RequestParam Map<String, String> reqPar) {

		String id = reqPar.get("exampleInputID");
		String name = reqPar.get("exampleInputName");
		String submit = reqPar.get("exampleInputSubmit");
		String calculate = reqPar.get("exampleInputCalculate");
		String password = reqPar.get("exampleInputPassword");
		String role = reqPar.get("exampleInputRole");

		System.out.println(id + " " + name + " " + submit + " " + calculate);

		ModelAndView model = new ModelAndView("adminnew");
		return model;
	}
	*/
	@RequestMapping(value = "/newemp", method = RequestMethod.POST)
	public String submitAdminNew(@ModelAttribute("newEmployee") Employee employee) {
		
		employeeService.saveEmployee(employee);
		

		return "redirect:/list";
	}

	/*
	 * @PostMapping("/newemp") public String
	 * saveEmployee(@ModelAttribute("employee") Employee employee) { // save the
	 * customer using the service //employeeService.saveEmployee(employee);
	 * 
	 * return "redirect:/list"; }
	 */
	// ADMIN/EXISTING

	@RequestMapping(value = "/admin/existinguser", method = RequestMethod.GET)
	public ModelAndView adminExisting() {

		ModelAndView model = new ModelAndView("adminexisting");
		return model;
	}

}
