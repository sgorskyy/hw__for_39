package com.example.hw_39.Rest;


import com.example.hw_39.Domain.Country;
import com.example.hw_39.Service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/countries")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @PostMapping("/addcountry")
    public ResponseEntity<Void> save(@RequestBody Country country) {
        countryService.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
