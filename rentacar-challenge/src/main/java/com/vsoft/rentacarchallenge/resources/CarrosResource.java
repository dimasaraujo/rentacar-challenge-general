package com.vsoft.rentacarchallenge.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarrosResource {

    @GetMapping
    public String listarCarros(){
        return "Carro 01, Carro 02";
    }
}
