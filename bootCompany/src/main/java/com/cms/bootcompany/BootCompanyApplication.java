package com.cms.bootcompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cms.bootcompany.dao.DepartmentDao;
import com.cms.bootcompany.model.Department;

@SpringBootApplication
public class BootCompanyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(BootCompanyApplication.class, args);
        DepartmentDao dao=context.getBean(DepartmentDao.class);
        Department department=dao.find(10);
        System.out.println(department);
    }

}