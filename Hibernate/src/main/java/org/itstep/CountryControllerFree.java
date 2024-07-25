package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.stream.Collectors;

@Controller
public class CountryControllerFree {
    @Autowired
    CountryService countryService;

    @GetMapping("/countries/all")
    public ModelAndView getCountries(){
        var countries = countryService.findAll();
        var params = new HashMap<String, Object>();
        params.put("countries", countries);
        return new ModelAndView("showCountries", params);
    }

    @GetMapping("/countries/page")
    public ModelAndView getCountriesA(){
        var countries = countryService
                .findAll()
                .stream()
                .filter(country -> country.getName().charAt(0)=='A')
                .collect(Collectors.toList());
        var params = new HashMap<String, Object>();
        params.put("countries", countries);
        return new ModelAndView("showCountries", params);
    }
}
