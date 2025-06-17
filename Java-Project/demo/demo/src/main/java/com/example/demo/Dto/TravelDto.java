package com.example.demo.Dto;

import java.sql.Time;

import lombok.Data;
@Data
public class TravelDto {
    private String license_plate_bus;
    private String tz_drivaer;
    private String number_line ;
    private Time departure_time;

}
