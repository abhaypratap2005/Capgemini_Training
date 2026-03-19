package com.cms.employeetransportproblem.repository;

import com.cms.employeetransportproblem.model.Booking;
import com.cms.employeetransportproblem.model.Cab;
import com.cms.employeetransportproblem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    }

