package com.exemplo.demo.controller;

import com.exemplo.demo.entities.Departamento;
import com.exemplo.demo.entities.Produto;
import com.exemplo.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoReposity;
    @GetMapping
    public List<Produto> getProdutos(){
        List<Produto> produtos = produtoReposity.findAll();
        return produtos;
    }
}
