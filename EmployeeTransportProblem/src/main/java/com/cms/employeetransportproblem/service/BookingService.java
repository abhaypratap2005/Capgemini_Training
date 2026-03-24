package com.cms.employeetransportproblem.service;

import com.cms.employeetransportproblem.model.Booking;
import com.cms.employeetransportproblem.model.Cab;
import com.cms.employeetransportproblem.model.Employee;
import com.cms.employeetransportproblem.repository.BookingRepo;
import com.cms.employeetransportproblem.repository.CabRepo;
import com.cms.employeetransportproblem.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {


    private BookingRepo bookingrepo;


    private CabRepo cabrepo;


    private EmployeeRepo emprepo;

    public Booking allocateCab(List<Long> employeeIds, Long cabId, LocalDate date) {

        if (cabId==null) {
            throw new IllegalArgumentException("Employee IDs cannot be null or empty");
        }

        Cab cab = cabrepo.findById(cabId)
                .orElseThrow(() -> new IllegalArgumentException("Cab not found with ID: " + cabId));

        List<Employee> employees = emprepo.findAllById(employeeIds);


        if(employees.size() != employeeIds.size()) {
            throw new IllegalArgumentException("One or more employees not found");
        }

        if (employees.size() > cab.getCapacity()) {
            throw new IllegalArgumentException("Cab capacity exceeded");
        }

        Booking booking = new Booking();
        booking.setCab(cab);
        booking.setEmployees(employees);
        booking.setBookingDate(date);

        cab.setStatus("BOOKED");
        cabrepo.save(cab);

        return bookingrepo.save(booking);
    }

    public List<Booking> getCabbyEmp(Long id, LocalDate date) {
        return bookingrepo.findByEmployees_IdAndBookingDate(id, date);
    }

    public List<Booking> getCabStatus(LocalDate date){
        return bookingrepo.findByBookingDate(date);
    }
}