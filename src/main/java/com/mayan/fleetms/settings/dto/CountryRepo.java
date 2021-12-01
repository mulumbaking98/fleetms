package com.mayan.fleetms.settings.dto;

import com.mayan.fleetms.settings.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country,Integer> {
}
