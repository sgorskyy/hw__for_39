package com.example.hw_39.Repository;


import com.example.hw_39.Domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository  extends JpaRepository<Country, Long> {

}
