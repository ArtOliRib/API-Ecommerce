package com.Arthur.ecommerce_api.repositorio;
import com.Arthur.ecommerce_api.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProduto extends JpaRepository<Produto, Long> {
}
