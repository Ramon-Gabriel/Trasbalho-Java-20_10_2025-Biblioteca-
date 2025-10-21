package com.cesumar01.lojajava.controler;


import com.cesumar01.lojajava.entity.Armazem;
import com.cesumar01.lojajava.service.ArmazemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArmazemControler {
    private final ArmazemService armazemService;

    public ArmazemControler(ArmazemService armazemService) {
        this.armazemService = armazemService;
    }

    @GetMapping
    public List<Armazem> getAll(){
        return armazemService.getAll();
    }

    @PostMapping
    public Armazem create(@RequestBody Armazem armazem){
        return armazemService.save(armazem);
    }

    @PutMapping("/armazem/{id}")
    public Armazem update(@PathVariable Long id, @RequestBody Armazem armazem){
        return armazemService.update(id, armazem);
    }
}
