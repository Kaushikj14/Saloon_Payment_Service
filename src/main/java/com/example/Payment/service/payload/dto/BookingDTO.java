package com.example.Payment.service.payload.dto;

import com.example.Payment.service.domain.BookingStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDTO {

    private Long id;
    private Long saloonId;
    private Long customerId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Set<Long> serviceIds;
    private BookingStatus status = BookingStatus.PENDING;

    public BookingDTO() {
    }

    public BookingDTO(Long id, Long saloonId, Long customerId, LocalDateTime startTime, LocalDateTime endTime, Set<Long> serviceIds, BookingStatus status) {
        this.id = id;
        this.saloonId = saloonId;
        this.customerId = customerId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.serviceIds = serviceIds;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSaloonId() {
        return saloonId;
    }

    public void setSaloonId(Long saloonId) {
        this.saloonId = saloonId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}
