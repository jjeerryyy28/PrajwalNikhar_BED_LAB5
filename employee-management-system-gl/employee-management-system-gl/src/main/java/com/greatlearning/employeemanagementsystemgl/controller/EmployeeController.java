package com.greatlearning.employeemanagementsystemgl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.greatlearning.employeemanagementsystemgl.entity.Employee;
import com.greatlearning.employeemanagementsystemgl.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/")
	public String home(Model model) {
		List<Employee> employees = employeeRepository.findAll();
		model.addAttribute("employees", employees);
		return "home";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("employee", new Employee());
		return "create";
	}

	@PostMapping("/create")
	public String createSubmit(@ModelAttribute Employee employee) {
		employeeRepository.save(employee);
		return "redirect:/";
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id, Model model) {
		Optional<Employee> employee = employeeRepository.findById(id);
		model.addAttribute("employee", employee.orElse(null));
		return "update";
	}

	@PostMapping("/update")
	public String updateSubmit(@ModelAttribute Employee employee) {
		employeeRepository.save(employee);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		employeeRepository.deleteById(id);
		return "redirect:/";
	}
}
