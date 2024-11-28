package com.Arthur.ecommerce_api.serviços;

import com.Arthur.ecommerce_api.entidades.Produto;
import com.Arthur.ecommerce_api.repositorio.RepositorioProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoProduto {

    // Corrigido: Removido o 'static' do campo
    @Autowired
    private RepositorioProduto produtoRepository;

    // Método para listar todos os produtos
    public List<Produto> listar() {
        return produtoRepository.findAll();  // Usando produtoRepository para obter os dados
    }

    // Método para salvar um produto
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);  // Usando produtoRepository para salvar o produto
    }
}
