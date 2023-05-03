package com.exemplo.demo.controller;

import com.exemplo.demo.entities.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @GetMapping
    public Produto getProdutos(){
        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("PC Gamer");
        produto.setPreco(4000);
        return produto;
    }
}
