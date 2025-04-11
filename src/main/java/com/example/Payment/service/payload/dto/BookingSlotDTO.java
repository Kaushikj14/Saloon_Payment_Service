package com.example.Payment.service.payload.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class BookingSlotDTO {

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public BookingSlotDTO() {
    }

    public BookingSlotDTO(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
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
}
