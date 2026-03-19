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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

