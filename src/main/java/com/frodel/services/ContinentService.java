package com.frodel.services;

import com.frodel.model.Continent;
import com.frodel.model.Country;
import com.frodel.repositories.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {

    @Autowired
    private ContinentRepository continentRepository;


    /**
     * Save the given continent
     *
     * @param continent the continent
     * @return the saved continent
     */
    public Continent saveContinent(Continent continent) {
        return continentRepository.save(continent);
    }

    /**
     * Find a continent by its name
     *
     * @param name The name of the continent to find
     * @return The continent found or null if the continent wasn't found
     */
    public Continent findContinentByName(String name) {
        return continentRepository.findContinentByName(name);
    }

    public List<Country> findCountriesOfContinent(String name) {
        List<Country> countries = null;
        Continent continent = findContinentByName(name);
        if (continent != null) {
            countries = continent.getCountries();
        }
        return countries;
    }

    /**
     * Find all continents
     *
     * @return All continents
     */
    public Iterable<Continent> findAllContinents() {
        return continentRepository.findAll();
    }
}
