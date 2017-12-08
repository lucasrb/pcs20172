/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import lombok.Data;

/**
 *
 * @author rsbramb
 */
@Data public class CardapioVO {
    private Integer id;
    private Integer idRestaurante;
    private String nome;
    private String descricao;
    private Double preco;

    public CardapioVO(Integer id, Integer idRestaurante, String nome, String descricao, Double preco) {
        this.id = id;
        this.idRestaurante = idRestaurante;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    
}
