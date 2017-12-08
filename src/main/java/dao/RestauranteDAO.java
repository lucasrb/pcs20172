/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import vo.EnderecoVO;
import vo.RestauranteVO;

/**
 *
 * @author rsbramb
 */
public class RestauranteDAO {

    public static String localPath = System.getProperty("user.dir");

    public static List<RestauranteVO> getRestaurantes() {
        File restaurantesXML = new File(RestauranteDAO.localPath + "/src/main/java/data/Restaurante.xml");
        SAXBuilder builder = new SAXBuilder();
        List<RestauranteVO> list = new ArrayList<RestauranteVO>();

        try {
            Document doc = builder.build(restaurantesXML);
            Element root = (Element) doc.getRootElement();

            Iterator clientes = root.getChildren("restaurante").iterator();

            while (clientes.hasNext()) {
                Element restaurante = (Element) clientes.next();
                Integer id = Integer.parseInt(restaurante.getChildText("id"));
                String nome = restaurante.getChildText("nome");
                String telefone = restaurante.getChildText("telefone");
                String descricao = restaurante.getChildText("descricao");

                List<EnderecoVO> enderecos = EnderecoDAO.getEnderecos(id);

                RestauranteVO vo = new RestauranteVO(id, nome, telefone, descricao, enderecos);
                list.add(vo);
            }
        } catch (IOException ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JDOMException ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
