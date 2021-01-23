package com.doroshuk.spring.mvc_hibernate_aop.dao;

import com.doroshuk.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface Idao {
    public List<Employee> getAll();
    public void save(Employee employee);
}
