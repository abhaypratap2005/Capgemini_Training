package com.gal.algo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MyBeansConfig {

    @Bean
    StringBuilder getStringBuilder() {
        return new StringBuilder("bean from configuration");
    }

    @Bean
    @Primary
    Calc getCalc() {
        return new MyCalc();
    }

    @Bean(name = "calcNameBean")
    Calc getCalc2() {
        return new MyCalc();
    }

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/company_db");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;
    }
}
