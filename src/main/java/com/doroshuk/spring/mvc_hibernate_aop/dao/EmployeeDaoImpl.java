package com.doroshuk.spring.mvc_hibernate_aop.dao;

import com.doroshuk.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class EmployeeDaoImpl implements Idao{

    private SessionFactory sessionFactory;

    @Autowired
    public EmployeeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public List<Employee> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee>employeeList = session.createQuery("from Employee",Employee.class).getResultList();


        return employeeList;
    }
}
