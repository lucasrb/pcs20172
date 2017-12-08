/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import dao.ClienteDAO;
import vo.ClienteVO;

/**
 *
 * @author bruno.franco
 */
public class CadastroController {

    
    public void cadastrarCliente(ClienteVO clienteVO, Integer tipoCliente){
        ClienteDAO.editarNovoCliente(clienteVO, tipoCliente);
    }
    
    public void editarCadatro(ClienteVO clienteVO){
        ClienteDAO.editarCliente(clienteVO);
    }
    
    public void salvaDadosUsuarioLogado(ClienteVO clienteVO){
        ClienteDAO.salvaDadosUsuarioLogado(clienteVO);
    }
}
