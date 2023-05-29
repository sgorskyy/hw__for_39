package com.example.hw_39.Domain;

import jakarta.persistence.*;
import lombok.*;


@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long city_id;
    @Column
    private String city_name;
    @Column
    private long city_population;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @Getter(AccessLevel.NONE)
    private Country country;

    @Column
    private long country_city_id;

    public void setCountry(Country country) {
        this.country = country;
        this.country_city_id = country.getCountry_id();
    }
}
