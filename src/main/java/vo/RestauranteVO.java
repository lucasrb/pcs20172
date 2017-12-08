/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Ricardo
 */
@Data public class RestauranteVO {

    private Integer id;
    private String nome;
    private String telefone;
    private String descricao;
    private List<EnderecoVO> enderecos;
    private List<CardapioVO> cardapio;
    
    public RestauranteVO(Integer id, String nome, String telefone, String descricao, List<EnderecoVO> enderecos, List<CardapioVO> cardapio) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.descricao = descricao;
        this.enderecos = enderecos;
        this.cardapio = cardapio;
    }
}
