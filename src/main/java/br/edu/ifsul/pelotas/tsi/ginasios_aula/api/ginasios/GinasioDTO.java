package br.edu.ifsul.pelotas.tsi.ginasios_aula.api.ginasios;

import lombok.Data;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

@Data
public class ProdutoDTO {
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private Long estoque;

    public static ProdutoDTO create(Ginasio p){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(p, ProdutoDTO.class);
    }
}
