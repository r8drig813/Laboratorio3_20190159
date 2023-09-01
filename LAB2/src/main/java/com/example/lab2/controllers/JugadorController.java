package com.example.lab2.controllers;

import com.example.lab2.entity.Jugador;
import com.example.lab2.repository.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/jugador")
public class JugadorController {

    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping(value = {"", "/listar"})
    public String listar(Model model) {
        model.addAttribute("lista", jugadorRepository.findAll());
        return "jugador/lista";
    }


    @GetMapping("/new")
    public String crear() {
        return "jugador/newform";
    }

    @PostMapping("/guardar")
    public String guardar(Jugador shipper) {
        jugadorRepository.save(shipper);
        return "redirect:/jugador/listar";
    }

    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Jugador> optional = jugadorRepository.findById(id);

        if (optional.isPresent()) {
            jugadorRepository.deleteById(id);
        }

        return "redirect:/jugador/listar";
    }
}
