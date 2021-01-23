package com.doroshuk.spring.mvc_hibernate_aop.services;

import com.doroshuk.spring.mvc_hibernate_aop.dao.Idao;
import com.doroshuk.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements Iservice{

    private Idao idao;

    @Autowired
    public EmployeeServiceImpl(Idao idao) {
        this.idao = idao;
    }

    @Transactional
    @Override
    public List<Employee> getAll() {
       return idao.getAll();
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        idao.save(employee);
    }
}
