package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SearchFacade {

    @Autowired
    private CompanyDao company;
    @Autowired
    private EmployeeDao employee;

    public Employee findEmployeeByString(String searchString) {
        Employee found = employee.findEmployeeByString(searchString);
        return found;
    }
    public Company findCompanyByString(String searchString) {
        Company found = company.findCompanyByString(searchString);
        return found;
    }
}
