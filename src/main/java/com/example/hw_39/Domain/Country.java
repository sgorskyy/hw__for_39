package com.example.hw_39.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table/*(name = "city")*/
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long country_id;

    @Column
    private String country_name;

    @Column
    private long country_population;

    @OneToMany(mappedBy = "country")
    private List<City> cities;
}
