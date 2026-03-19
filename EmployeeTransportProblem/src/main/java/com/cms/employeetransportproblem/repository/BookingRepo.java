package com.cms.employeetransportproblem.repository;

import com.cms.employeetransportproblem.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

    List<Booking> findByBookingDate(LocalDate date);

    // Added underscore to properly traverse the List<Employee> to find the ID
    List<Booking> findByEmployees_IdAndBookingDate(Long id, LocalDate date);
}