package com.example.imoveisapi.controller;


import com.example.imoveisapi.model.CasaModel;
import com.example.imoveisapi.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CasaController {

    @Autowired
    private CasaRepository repository;

    @GetMapping("/casas")
    public List<CasaModel> get() {
        return repository.findAll();
    }

    @PostMapping("/casas")
    public String add(@RequestBody CasaModel casa) {
        repository.save(casa);
        return "Salvo com sucesso.";
    }

    @DeleteMapping("/casas/{id}")
    public String remove(@PathVariable Long id) {
        repository.deleteById(id);
        return "Removido com sucesso.";
    }

    @PutMapping("/casa")
    public String update(@RequestBody CasaModel casa) {
        repository.save(casa);
        return "Editado com sucesso.";
    }

}
