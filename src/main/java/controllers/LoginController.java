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
public class LoginController {

    public boolean confirmaLogin(ClienteVO clienteLogin, String tipo) {
        if (clienteLogin.getEmail().length() != 0 || clienteLogin.getEmail() != null) {
            if (clienteLogin.getSenha() != null || clienteLogin.getSenha().length() != 0) {

                ClienteVO clienteVO = ClienteDAO.buscarCliente(clienteLogin.getEmail());

                if (clienteVO != null) {
                    String senha = clienteLogin.getSenha();
                    if (senha.equals(clienteVO.getSenha())) {
                        String tipoCliente = tipo;
                        if (tipoCliente.equals(clienteVO.getTipo())) {
                            ClienteDAO.salvaDadosUsuarioLogado(clienteVO);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public ClienteVO buscarClienteLogado(){
        return ClienteDAO.buscarClienteLogado();
    }
}
