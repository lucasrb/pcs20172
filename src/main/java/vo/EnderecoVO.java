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
@Data public class EnderecoVO {

    private Integer id;
    private Integer idRestaurante;
    private String cep;
    private String rua;
    private Integer numero;
    private String complemento;

    public EnderecoVO(Integer id, Integer idRestaurante, String cep, String rua, Integer numero, String complemento) {
        this.id = id;
        this.idRestaurante = idRestaurante;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

}
