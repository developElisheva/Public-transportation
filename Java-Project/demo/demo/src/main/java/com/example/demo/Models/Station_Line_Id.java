package com.example.demo.Models;

import java.io.Serializable;

import lombok.Data;

@Data
public class Station_Line_Id implements Serializable {
    private Long line;
    private Long station;
}
