package com.refugio.trabajo2.controllers;

import com.refugio.trabajo2.models.Animal;
import com.refugio.trabajo2.repositories.Refugios;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


    @Controller
    public class Controlador1 {

        @GetMapping("/")
        public String menu() {
            return "menu";
        }

        @GetMapping("/peticion1")
        public String peticion1(Model model) {
            String salida = Refugios.lista.stream()
                    .map(r -> r.getNombre().toUpperCase())
                    .collect(Collectors.joining(", "));
            model.addAttribute("salida", salida);
            return "vista1";
        }

        @GetMapping("/peticion2")
        public String peticion2(Model model) {
            DoubleSummaryStatistics estadisticas = Refugios.lista.stream()
                    .collect(Collectors.summarizingDouble(r -> r.getAnimales().size()));
            model.addAttribute("conteo", estadisticas.getCount());
            model.addAttribute("sumatotal", estadisticas.getSum());
            model.addAttribute("promedio", estadisticas.getAverage());
            model.addAttribute("min", estadisticas.getMin());
            model.addAttribute("max", estadisticas.getMax());
            return "vista2";
        }

        @GetMapping("/peticion3")
        public String peticion3(Model model) {
            List<Animal> todosAnimales = Refugios.lista.stream()
                    .flatMap(r -> r.getAnimales().stream())
                    .toList();
            List<String> nombresAnimales = todosAnimales.stream()
                    .map(Animal::getNombre)
                    .toList();
            model.addAttribute("nombresAnimales", nombresAnimales);
            return "vista3";
        }

        @GetMapping("/peticion4")
        public String peticion4(Model model) {
            Boolean sinAnimales = Refugios.lista.stream()
                    .anyMatch(r -> r.getAnimales().isEmpty());
            Boolean masDeUno = Refugios.lista.stream()
                    .anyMatch(r -> r.getAnimales().size() > 1);
            Boolean MasDeTres = Refugios.lista.stream()
                    .noneMatch(r -> r.getAnimales().size() > 3);
            model.addAttribute("sinAnimales", sinAnimales);
            model.addAttribute("masDeUno", masDeUno);
            model.addAttribute("MasDeTres", MasDeTres);
            return "vista4";
        }

        @GetMapping("/peticion5")
        public String peticion5(Model model) {
            Optional<Animal> animalMasViejo = Refugios.lista.stream()
                    .flatMap(r -> r.getAnimales().stream())
                    .max((a1, a2) -> Integer.compare(a1.getEdad(), a2.getEdad()));
            model.addAttribute("animalMasViejo", animalMasViejo.orElse(null));
            return "vista5";
        }
    }
