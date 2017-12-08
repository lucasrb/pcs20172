/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import controllers.CadastroController;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import views.LoginCredentials;
import vo.ClienteVO;

/**
 *
 * @author lucas
 */
public class ClienteDAO {

    /**
     * verifica se a base de dados já existe
     *
     * @param path
     * @return true se exitir, false caso contrário
     */
    private static boolean XMLExiste(String path) {

        File arquivo = new File(path);

        if (arquivo.exists()) {
            return true;
        }

        return false;
    }

    private static Element preencheElementoXML(ClienteVO clienteVO, Integer tipoCliente) {

        Element cliente = new Element("cliente");
        Element nome = new Element("nome");
        Element sobrenome = new Element("sobrenome");
        Element tipo = new Element("tipo");
        Element email = new Element("email");
        Element cpf = new Element("cpf");
        Element dtNasc = new Element("dataNascimento");
        Element sexo = new Element("sexo");
        Element senha = new Element("senha");
        Element endereco = new Element("endereco");
        Element rua = new Element("rua");
        Element numero = new Element("numero");
        Element bairro = new Element("bairro");
        Element complemento = new Element("complemento");
        Element cep = new Element("cep");
        Element cidade = new Element("cidade");
        Element estado = new Element("estado");
        Element ptReferencia = new Element("ptReferencia");

        endereco.addContent(rua);
        endereco.addContent(numero);
        endereco.addContent(bairro);
        endereco.addContent(complemento);
        endereco.addContent(cep);
        endereco.addContent(cidade);
        endereco.addContent(estado);
        endereco.addContent(ptReferencia);

        nome.setText(clienteVO.getNome());
        sobrenome.setText(clienteVO.getSobrenome());
        tipo.setText(tipoCliente.toString());
        email.setText(clienteVO.getEmail());
        cpf.setText(clienteVO.getCpf());
        dtNasc.setText(clienteVO.getDtNasc());
        sexo.setText(clienteVO.getSexo());
        senha.setText(clienteVO.getSenha());

        cliente.addContent(nome);
        cliente.addContent(sobrenome);
        cliente.addContent(tipo);
        cliente.addContent(email);
        cliente.addContent(cpf);
        cliente.addContent(dtNasc);
        cliente.addContent(sexo);
        cliente.addContent(senha);
        cliente.addContent(endereco);

        return cliente;
    }

    public static void salvaDadosUsuarioLogado(ClienteVO clienteVO) {

        Element cliente = new Element("cliente");
        Element nome = new Element("nome");
        Element sobrenome = new Element("sobrenome");
        Element tipo = new Element("tipo");
        Element email = new Element("email");
        Element cpf = new Element("cpf");
        Element dtNasc = new Element("dataNascimento");
        Element sexo = new Element("sexo");
        Element senha = new Element("senha");
        Element endereco = new Element("endereco");
        Element rua = new Element("rua");
        Element numero = new Element("numero");
        Element bairro = new Element("bairro");
        Element complemento = new Element("complemento");
        Element cep = new Element("cep");
        Element cidade = new Element("cidade");
        Element estado = new Element("estado");
        Element ptReferencia = new Element("ptReferencia");

        nome.setText(clienteVO.getNome());
        sobrenome.setText(clienteVO.getSobrenome());
        tipo.setText(clienteVO.getTipo());
        email.setText(clienteVO.getEmail());
        cpf.setText(clienteVO.getCpf());
        dtNasc.setText(clienteVO.getDtNasc());
        sexo.setText(clienteVO.getSexo());
        senha.setText(clienteVO.getSenha());

        rua.setText(clienteVO.getRua());
        numero.setText(clienteVO.getNumero());
        bairro.setText(clienteVO.getBairro());
        complemento.setText(clienteVO.getComplemento());
        cep.setText(clienteVO.getCep());
        cidade.setText(clienteVO.getCidade());
        estado.setText(clienteVO.getEstado());
        ptReferencia.setText(clienteVO.getPtReferencia());

        endereco.addContent(rua);
        endereco.addContent(numero);
        endereco.addContent(bairro);
        endereco.addContent(complemento);
        endereco.addContent(cep);
        endereco.addContent(cidade);
        endereco.addContent(estado);
        endereco.addContent(ptReferencia);

        cliente.addContent(nome);
        cliente.addContent(sobrenome);
        cliente.addContent(tipo);
        cliente.addContent(email);
        cliente.addContent(cpf);
        cliente.addContent(dtNasc);
        cliente.addContent(sexo);
        cliente.addContent(senha);
        cliente.addContent(endereco);

        Document clientesXML = new Document(cliente);

        XMLOutputter xout = new XMLOutputter();
        FileWriter arquivo;

        try {
            arquivo = new FileWriter(new File("./src/main/java/data/DadosLogin.xml"));
            xout.setFormat(Format.getPrettyFormat());
            xout.output(clientesXML, arquivo);

        } catch (IOException ex) {
            Logger.getLogger(CadastroController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Escreve no Documento XML os elementos de cadastro de usuario
     *
     * @param doc
     */
    private static void escreveArquivo(Document doc) {

        XMLOutputter xout = new XMLOutputter();
        FileWriter arquivo;

        try {
            arquivo = new FileWriter(new File("./src/main/java/data/Clientes.xml"));
            xout.setFormat(Format.getPrettyFormat());
            xout.output(doc, arquivo);
        } catch (IOException ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editarNovoCliente(ClienteVO clienteVO, Integer tipoCliente) {
        if (XMLExiste("./src/main/java/data/Clientes.xml")) {

            File arquivoClientes = new File("./src/main/java/data/Clientes.xml");
            SAXBuilder builder = new SAXBuilder();

            Document doc;
            try {
                doc = builder.build(arquivoClientes);
                Element clientes = doc.getRootElement();
                Element cliente = preencheElementoXML(clienteVO, tipoCliente);
                clientes.addContent(cliente);

                escreveArquivo(doc);

            } catch (JDOMException ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Element clientes = new Element("clientes");
            Element cliente = preencheElementoXML(clienteVO, tipoCliente);
            clientes.addContent(cliente);
            Document clientesXML = new Document(clientes);

            escreveArquivo(clientesXML);
        }
    }

    /**
     * Captura dos dados referentes ao cliente com email de entrada no XML, e
     * retorna como um VO de cliente
     *
     * @param emailEntrada Email identificador do cliente a ser capturado
     * @return Dados armazenados em um objeto ClienteVO, ou null em caso de
     * cliente não encontrado
     */
    public static ClienteVO buscarCliente(String emailEntrada) {
        File arquivoClientes = new File("./src/main/java/data/Clientes.xml");
        SAXBuilder builder = new SAXBuilder();
        ClienteVO clienteVO = new ClienteVO();

        Document doc;

        try {
            doc = builder.build(arquivoClientes);
            Element root = doc.getRootElement();

            List clientes = root.getChildren("cliente");

            Iterator i = clientes.iterator();

            while (i.hasNext()) {
                Element cliente = (Element) i.next();
                String childEmail = cliente.getChildText("email");

                if (emailEntrada.equals(childEmail)) {
                    clienteVO.setNome(cliente.getChildText("nome"));
                    clienteVO.setSobrenome(cliente.getChildText("sobrenome"));
                    clienteVO.setEmail(cliente.getChildText("email"));
                    clienteVO.setCpf(cliente.getChildText("cpf"));
                    clienteVO.setDtNasc(cliente.getChildText("dataNascimento"));
                    clienteVO.setSenha(cliente.getChildText("senha"));
                    clienteVO.setTipo(cliente.getChildText("tipo"));
                    clienteVO.setRua(cliente.getChild("endereco").getChildText("rua"));
                    clienteVO.setNumero(cliente.getChild("endereco").getChildText("numero"));
                    clienteVO.setBairro(cliente.getChild("endereco").getChildText("bairro"));
                    clienteVO.setComplemento(cliente.getChild("endereco").getChildText("complemento"));
                    clienteVO.setCep(cliente.getChild("endereco").getChildText("cep"));
                    clienteVO.setCidade(cliente.getChild("endereco").getChildText("cidade"));
                    clienteVO.setEstado(cliente.getChild("endereco").getChildText("estado"));
                    clienteVO.setPtReferencia(cliente.getChild("endereco").getChildText("ptReferencia"));
                    break;
                }
            }
        } catch (JDOMException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (clienteVO.getEmail() != null) {
            return clienteVO;
        }

        return null;
    }

    /**
     * Captura dos dados referentes ao cliente logado no XML, e retorna como um
     * VO de cliente
     *
     * @return Dados armazenados em um objeto ClienteVO
     */
    public static ClienteVO buscarClienteLogado() {
        File arquivoClientes = new File("./src/main/java/data/DadosLogin.xml");
        SAXBuilder builder = new SAXBuilder();
        ClienteVO clienteVO = new ClienteVO();

        Document doc;

        try {
            doc = builder.build(arquivoClientes);
            Element root = doc.getRootElement();
            Element endereco = root.getChild("endereco");

            clienteVO.setNome(root.getChildText("nome"));
            clienteVO.setSobrenome(root.getChildText("sobrenome"));
            clienteVO.setEmail(root.getChildText("email"));
            clienteVO.setCpf(root.getChildText("cpf"));
            clienteVO.setDtNasc(root.getChildText("dataNascimento"));
            clienteVO.setSenha(root.getChildText("senha"));
            clienteVO.setSexo(root.getChildText("sexo"));
            clienteVO.setTipo(root.getChildText("tipo"));
            clienteVO.setRua(endereco.getChildText("rua"));
            clienteVO.setNumero(endereco.getChildText("numero"));
            clienteVO.setBairro(endereco.getChildText("bairro"));
            clienteVO.setComplemento(endereco.getChildText("complemento"));
            clienteVO.setCep(endereco.getChildText("cep"));
            clienteVO.setCidade(endereco.getChildText("cidade"));
            clienteVO.setEstado(endereco.getChildText("estado"));
            clienteVO.setPtReferencia(endereco.getChildText("ptReferencia"));
        } catch (JDOMException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clienteVO;
    }

    public static void editarCliente(ClienteVO clienteVO) {
        File arquivoClientes = new File("./src/main/java/data/Clientes.xml");
        SAXBuilder builder = new SAXBuilder();
        Document doc;

        try {
            doc = builder.build(arquivoClientes);
            Element root = doc.getRootElement();

            List clientes = root.getChildren();

            Iterator i = clientes.iterator();

            while (i.hasNext()) {
                Element cliente = (Element) i.next();
                String email = cliente.getChildText("email");

                if (email.equals(clienteVO.getEmail())) {
                    cliente.getChild("nome").setText(clienteVO.getNome());
                    cliente.getChild("sobrenome").setText(clienteVO.getSobrenome());
                    cliente.getChild("email").setText(clienteVO.getEmail());
                    cliente.getChild("cpf").setText(clienteVO.getCpf());
                    cliente.getChild("dataNascimento").setText(clienteVO.getDtNasc());
                    cliente.getChild("senha").setText(clienteVO.getSenha());
                    cliente.getChild("endereco").getChild("rua").setText(clienteVO.getRua());
                    cliente.getChild("endereco").getChild("numero").setText(clienteVO.getNumero());
                    cliente.getChild("endereco").getChild("bairro").setText(clienteVO.getBairro());
                    cliente.getChild("endereco").getChild("complemento").setText(clienteVO.getComplemento());
                    cliente.getChild("endereco").getChild("cidade").setText(clienteVO.getCidade());
                    cliente.getChild("endereco").getChild("estado").setText(clienteVO.getEstado());
                    cliente.getChild("endereco").getChild("ptReferencia").setText(clienteVO.getPtReferencia());
                    cliente.getChild("endereco").getChild("cep").setText(clienteVO.getCep());

                    escreveArquivo(doc);
                }
            }
        } catch (JDOMException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
