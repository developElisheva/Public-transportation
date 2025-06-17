package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
@IdClass(Station_Line_Id.class)
public class Station_Line {
    @Id
    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;
    @Id
    @ManyToOne
    @JoinColumn(name = "line_id")
    private Line line;

    private int stationOrder;
}
