package com.example.imoveisapi.controller;

import com.example.imoveisapi.model.ImobiliariaModel;
import com.example.imoveisapi.repository.ImobiliariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImobiliariaController {

    @Autowired
    ImobiliariaRepository repository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/imobiliaria")
    public List<ImobiliariaModel> get(){
        return repository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/imobiliaria")
    public String add(@RequestBody ImobiliariaModel imobiliaria) {
        repository.save(imobiliaria);
        return "Adicionada com sucesso";
    }

    @DeleteMapping("/imobiliaria/{id}")
    public String remove(@PathVariable Long id) {
        repository.deleteById(id);
        return "Removido com sucesso.";
    }

    @PutMapping("/imobiliaria")
    public String update(@RequestBody ImobiliariaModel imobiliaria) {
        repository.save(imobiliaria);
        return "Salvo com sucesso";
    }

}
