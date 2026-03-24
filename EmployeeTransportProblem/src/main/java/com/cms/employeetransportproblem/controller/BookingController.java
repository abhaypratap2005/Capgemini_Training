package com.cms.employeetransportproblem.controller;


import com.cms.employeetransportproblem.BookingRequest;
import com.cms.employeetransportproblem.model.Booking;
import com.cms.employeetransportproblem.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/booking")


public class BookingController {

//    Logger logger  =  LoggerFactory.getLogger(BookingController.class);
//public Booking createBooking(Booking booking){
//    logger.info("CreatingInfo.....INFO");
//    logger.info("BookingCab....INFO");
//    logger.info("CreatingCab.....DEBUG");
//    return booking;
//}



    private BookingService service;

    @PostMapping("/allocate")
    public ResponseEntity<?> allocateCab(@RequestBody BookingRequest req) {

        Booking booking = service.allocateCab(
                req.getEmployeeIds(),
                req.getCabId(),
                req.getDate()
        );

        return ResponseEntity.ok(booking);
    }


    @GetMapping("/employee")
    public ResponseEntity<?> getCabForEmployee(
            @RequestParam Long empId,
            @RequestParam String date) {

        return ResponseEntity.ok(
                service.getCabbyEmp(empId, LocalDate.parse(date))
        );
    }

    @GetMapping("/status")
    public ResponseEntity<?> getCabStatus(@RequestParam String date) {

        return ResponseEntity.ok(
                service.getCabStatus(LocalDate.parse(date))
        );
    }
}
