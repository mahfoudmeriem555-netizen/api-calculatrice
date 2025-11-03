package com.example.calculatrice.controller;

import com.example.calculatrice.entites.Nombres;
import com.example.calculatrice.service.CalculService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CalculateurController {

    @Autowired
    private CalculService calculService;

    // Méthode 1 : addition via paramètres dans l’URL (GET)
    @GetMapping("/somme")
    public double additionParParametres(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    // Méthode 2 : addition via un objet JSON (POST)
    @PostMapping("/somme")
    public double additionParObjet(@RequestBody Nombres nombres) {
        return calculService.additionner(nombres);
    }
}

