/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.util.List;

/**
 *
 * @author Ricardo
 */
public class RestauranteVO {

    private Integer id;
    private String nome;
    private String telefone;
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private List<EnderecoVO> enderecos;

    public RestauranteVO(Integer id, String nome, String telefone, String descricao, List<EnderecoVO> enderecos) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.descricao = descricao;
        this.enderecos = enderecos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<EnderecoVO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoVO> enderecos) {
        this.enderecos = enderecos;
    }

}
