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
import vo.CardapioVO;
import vo.EnderecoVO;
import vo.RestauranteVO;

/**
 *
 * @author rsbramb
 */
public class CardapioDAO {

    public static String localPath = System.getProperty("user.dir");

    public static List<CardapioVO> getRestaurantes(Integer idRestaurante) {
        File cardapioXML = new File(CardapioDAO.localPath + "/src/main/java/data/Cardapio.xml");
        SAXBuilder builder = new SAXBuilder();
        List<CardapioVO> list = new ArrayList<CardapioVO>();

        try {
            Document doc = builder.build(cardapioXML);
            Element root = (Element) doc.getRootElement();

            Iterator pratos = root.getChildren("prato").iterator();

            while (pratos.hasNext()) {
                Element restaurante = (Element) pratos.next();
                Integer idRestauranteXML = Integer.parseInt(restaurante.getChildText("idRestaurante"));

                if (idRestauranteXML.equals(idRestaurante)) {
                    Integer id = Integer.parseInt(restaurante.getChildText("id"));
                    Double preco = Double.parseDouble(restaurante.getChildText("preco"));
                    String nome = restaurante.getChildText("nome");
                    String descricao = restaurante.getChildText("descricao");

                    CardapioVO vo = new CardapioVO(id, idRestaurante, nome, descricao, preco);
                    list.add(vo);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JDOMException ex) {
            Logger.getLogger(RestauranteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
