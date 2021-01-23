package com.doroshuk.spring.mvc_hibernate_aop.controllers;

import com.doroshuk.spring.mvc_hibernate_aop.dao.EmployeeDaoImpl;
import com.doroshuk.spring.mvc_hibernate_aop.dao.Idao;
import com.doroshuk.spring.mvc_hibernate_aop.entity.Employee;
import com.doroshuk.spring.mvc_hibernate_aop.services.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FirstController {

    private Iservice iservice;

    @Autowired
    public FirstController(Iservice iservice) {
        this.iservice = iservice;
    }

    @RequestMapping("/")
    public String showAllEmployee(Model model) {

        List<Employee> listAllEmployee = iservice.getAll();
        model.addAttribute("listAllEmployeeAttribute", listAllEmployee);
        return "showAllEmployeeView";
    }
    @RequestMapping("/addEmployee")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employeeAtribute",employee);

        return "addEmployeeView";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("addEmployeeView") Employee employee){

        iservice.save(employee);

        return "redirect:/";
    }

}
