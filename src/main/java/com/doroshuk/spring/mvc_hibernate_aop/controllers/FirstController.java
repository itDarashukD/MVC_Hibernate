package com.doroshuk.spring.mvc_hibernate_aop.controllers;

import com.doroshuk.spring.mvc_hibernate_aop.dao.EmployeeDaoImpl;
import com.doroshuk.spring.mvc_hibernate_aop.dao.Idao;
import com.doroshuk.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FirstController {


    private Idao idao;

    @Autowired
    public FirstController(Idao idao) {
        this.idao = idao;
    }

    @RequestMapping("/")
    public String showAllEmployee(Model model){

        List<Employee>listAllEmployee =  idao.getAll();
        model.addAttribute("listAllEmployeeAttribute",listAllEmployee);
        return "showAllEmployeeView";
    }
}
