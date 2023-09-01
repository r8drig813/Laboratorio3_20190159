package com.example.lab2.controllers;

import com.example.lab2.entity.Estadio;
import com.example.lab2.entity.Jugador;
import com.example.lab2.repository.EstadioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
@Controller
@RequestMapping("/estadio")
public class EstadioController {

    final EstadioRepository estadioRepository;

    public EstadioController(EstadioRepository estadioRepository) {
        this.estadioRepository = estadioRepository;
    }


    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("lista", estadioRepository.findAll());
        return "estadios/lista";
    }


    @GetMapping("/new")
    public String crear() {
        return "estadios/newform";
    }

    @PostMapping("/guardar")
    public String guardar(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/estadio/listar";
    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Estadio> optional = estadioRepository.findById(id);

        if (optional.isPresent()) {
            estadioRepository.deleteById(id);
        }

        return "redirect:/estadio/listar";
    }
}
