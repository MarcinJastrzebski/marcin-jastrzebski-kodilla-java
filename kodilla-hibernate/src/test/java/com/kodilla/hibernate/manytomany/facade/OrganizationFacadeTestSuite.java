package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrganizationFacadeTestSuite {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    OrganizationFacade organizationFacade;

    @Test
    public void facadeTest() {
        //Given
        Employee employee1 = new Employee("Rysiek", "Bogacz");
        Company company1 = new Company("Luxmed");

        company1.getEmployees().add(employee1);
        employee1.getCompanies().add(company1);

        companyDao.save(company1);
        employeeDao.save(employee1);

        //When
        List<Employee> findEmployee = organizationFacade.findEmployee("oga");
        List<Company> findCompany = organizationFacade.findCompany("xm");

        //Then
        try {
            Assert.assertEquals(1, findEmployee.size());
            Assert.assertEquals(1, findCompany.size());
        } finally {
            companyDao.deleteAll();
            employeeDao.deleteAll();

        }
    }
}