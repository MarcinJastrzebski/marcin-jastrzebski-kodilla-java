package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        try {
            //Then
            Assert.assertNotEquals(0, softwareMachineId);
            Assert.assertNotEquals(0, dataMaestersId);
            Assert.assertNotEquals(0, greyMatterId);
        } catch (Exception e) {
            //do nothing
        } finally {
            //CleanUp
            companyDao.deleteAll();
        }
    }

    @Test
    public void testNamedNativeQuery(){
        //Given
        Company company1 = new Company("Kodilla");
        Company company2 = new Company("Kodzilla");
        Company company3 = new Company("Microsoft");
        Company company4 = new Company("Motorolla");

        Employee employee1 = new Employee("Adam", "Kowalski");
        Employee employee2 = new Employee("Michał", "Kowalski");
        Employee employee3 = new Employee("Tomasz", "Biedrzycki");
        Employee employee4 = new Employee("Zbigniew", "Stonoga");

        company1.getEmployees().add(employee1);
        company1.getEmployees().add(employee2);
        company2.getEmployees().add(employee2);
        company2.getEmployees().add(employee3);
        company3.getEmployees().add(employee3);
        company3.getEmployees().add(employee4);
        company4.getEmployees().add(employee4);
        company4.getEmployees().add(employee1);

        employee1.getCompanies().add(company1);
        employee1.getCompanies().add(company4);
        employee2.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company2);
        employee3.getCompanies().add(company3);
        employee4.getCompanies().add(company3);
        employee4.getCompanies().add(company4);

        companyDao.save(company1);
        int id = company1.getId();
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        //When
        List<Company> companiesWithLetters = companyDao.retrieveCompaniesStartingWithLetters("Kod");
        List<Employee> employeesWithGivenLastName = employeeDao.retrieveEmployeesWithGivenLastName("Kowalski");

        //Then
        try {
            Assert.assertEquals(2, companiesWithLetters.size());
            Assert.assertEquals(2, employeesWithGivenLastName.size());
        } finally {
            companyDao.deleteAll();
            employeeDao.deleteAll();
        }
    }
}