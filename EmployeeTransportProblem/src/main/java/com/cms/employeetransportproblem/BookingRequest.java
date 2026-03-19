package com.cms.employeetransportproblem;


import java.time.LocalDate;
import java.util.List;

public class BookingRequest {

        private List<Long> employeeIds;
        private Long cabId;
        private LocalDate date;


    public List<Long> getEmployeeIds() {
        return employeeIds;
    }

    public void setEmployeeIds(List<Long> employeeIds) {
        this.employeeIds = employeeIds;
    }

    public Long getCabId() {
        return cabId;
    }

    public void setCabId(Long cabId) {
        this.cabId = cabId;
    }
// here we are getting the local date
    public LocalDate getDate() {
        return date;
    }
//here we are setting the date
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

