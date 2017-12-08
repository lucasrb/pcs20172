/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import lombok.Data;

/**
 *
 * @author bruno.franco
 */
@Data public class ClienteVO {
    
    private String  nome;
    private String  sobrenome;
    private String  email;
    private String  cpf;
    private String  dtNasc;
    private String  sexo;
    private String  senha;
    private String  cnfSenha;
    private String  tipo;
    private String  rua;
    private String  numero;
    private String  bairro;
    private String  cep;
    private String  complemento;
    private String  cidade;
    private String  estado;
    private String  ptReferencia;

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }
}
