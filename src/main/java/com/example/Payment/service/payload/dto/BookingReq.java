package com.example.Payment.service.payload.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingReq {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> serviceIds;

    public BookingReq() {
    }

    public BookingReq(LocalDateTime startTime, LocalDateTime endTime, Set<Long> serviceIds) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.serviceIds = serviceIds;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Set<Long> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(Set<Long> serviceIds) {
        this.serviceIds = serviceIds;
    }
}
