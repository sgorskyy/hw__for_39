package com.example.hw_39.Rest;

import com.example.hw_39.Domain.City;
import com.example.hw_39.Service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;


    @GetMapping("/cityes")
    public List<City> findAll() {
        return cityService.findAll()/*.stream().map(City::getCity_name).collect(Collectors.toList())*/;
    }

    @PostMapping("/addcity")
    public ResponseEntity<Void> save(@RequestBody City city) {
        cityService.save(city);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/addcity/{id}/countries/{countryId}")
    public ResponseEntity<Void> update(@PathVariable Long id, @PathVariable Long countryId) {
        cityService.addCountry(id, countryId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


}
