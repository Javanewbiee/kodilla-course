package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    Employee findEmployeeByLastName(@Param("LASTNAME") String lastname);
    @Query
    Employee findEmployeeByString(@Param("EMPLOYEES") String searchString);
}
