package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    Company findCompanyByLetters(@Param("COMPANYNAME") String companyName);
    @Query
    Company findCompanyByString(@Param("COMPANYNAME") String searchString);
}
