package com.example.hw_39.Service;


import com.example.hw_39.Domain.Country;
import com.example.hw_39.Repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public void save(Country country)   {
        countryRepository.save(country);
    }
}
