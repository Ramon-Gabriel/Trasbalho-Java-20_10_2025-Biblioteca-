package com.cesumar01.lojajava.service;

import com.cesumar01.lojajava.entity.Armazem;
import com.cesumar01.lojajava.repository.ArmazemRepositori;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmazemService {
    private final ArmazemRepositori armazemRepositori;


    public ArmazemService(ArmazemRepositori armazemRepositori) {
        this.armazemRepositori = armazemRepositori;
    }

    public List<Armazem> getAll(){
        return armazemRepositori.findAll();
    }

    public Armazem save(Armazem armazem){
        return armazemRepositori.save(armazem);
    }

    public Armazem update(Long id, Armazem novoArmazem) {
        Armazem existente = armazemRepositori.findById(id).orElseThrow();
        existente.setNomeLivro(novoArmazem.getNomeLivro());
        existente.setGeneroLivro(novoArmazem.getGeneroLivro());
        existente.setAutor(novoArmazem.getAutor());
        return armazemRepositori.save(existente);
    }

}
