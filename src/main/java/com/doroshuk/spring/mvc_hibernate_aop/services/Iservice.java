package com.doroshuk.spring.mvc_hibernate_aop.services;

import com.doroshuk.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface Iservice {
    public List<Employee>getAll();
}
