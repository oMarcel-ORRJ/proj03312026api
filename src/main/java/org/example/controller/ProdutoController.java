package org.example.controller;

import org.example.model.Produto;
import org.example.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> findById(@PathVariable Long id){
        return produtoService.findById(id);
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

    @PutMapping("/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto){
        return produtoService.update(id, produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produtoService.delete(id);
    }
}