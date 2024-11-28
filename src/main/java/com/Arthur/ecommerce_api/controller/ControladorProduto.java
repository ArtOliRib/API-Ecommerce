package com.Arthur.ecommerce_api.controller;

import com.Arthur.ecommerce_api.entidades.Produto;
import com.Arthur.ecommerce_api.serviços.ServicoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ControladorProduto {

    @Autowired
    private ServicoProduto produtoService;  // Injeção de dependência da instância de ServicoProduto

    // Método para listar todos os produtos
    @GetMapping
    public List<Produto> listar() {
        return produtoService.listar();  // Usando a instância injetada para chamar o método listar
    }

    // Método para salvar um novo produto
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);  // Usando a instância injetada para salvar o produto
    }
}
