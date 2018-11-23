package com.registration_login.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.registration_login.model.Accounts;
import com.registration_login.model.Addresses;
import com.registration_login.model.Customers;
import com.registration_login.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		/*List<Customers> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);*/
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/open", method = RequestMethod.POST)
	public ModelAndView newContact(ModelAndView model, @ModelAttribute Customers customer, Addresses address, Accounts account) {

		System.out.println(customer+" "+address+" "+account);
		
		
		
		
		model.setViewName("home");
		return model;
	}

/*	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Customers employee) {
		if (employee.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:/");
	}
*/
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Customers employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}

}