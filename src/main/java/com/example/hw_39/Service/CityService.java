package com.example.hw_39.Service;

import com.example.hw_39.Domain.City;
import com.example.hw_39.Repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.hw_39.Repository.CityRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {

    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public void save(City city)   {
        cityRepository.save(city);
    }

    public void addCountry(Long cityId, Long countryId) {
        var country = countryRepository.findById(countryId).get();
        var city = cityRepository.findById(cityId).get();
        city.setCountry(country);
        cityRepository.save(city);
    }

}
