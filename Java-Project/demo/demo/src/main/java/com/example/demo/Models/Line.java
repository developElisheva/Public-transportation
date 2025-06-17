package com.example.demo.Models;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String sourse;
    private String destination;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "line", fetch = FetchType.LAZY)
    private List<Travel> travels;

    @ManyToMany
    @JoinTable(name = "station_Line", joinColumns = @JoinColumn(name = "line_id"), inverseJoinColumns = @JoinColumn(name = "station_id"))
    private List<Station> stations;
}
