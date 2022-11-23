package br.edu.ifsul.pelotas.tsi.ginasios_aula.api.ginasios;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Ginasio,Long> {

    List<Ginasio> findByNome(String nome);
}
