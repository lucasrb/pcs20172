/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.util.Calendar;
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

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }
}
