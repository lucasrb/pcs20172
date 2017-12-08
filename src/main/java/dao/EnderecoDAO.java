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

/**
 *
 * @author rsbramb
 */
public class EnderecoDAO {

    public static String localPath = System.getProperty("user.dir");

    public static List<EnderecoVO> getEnderecos(Integer idRestaurante) {
        File enderecosXML = new File(EnderecoDAO.localPath + "/src/main/java/data/Endereco.xml");
        SAXBuilder builder = new SAXBuilder();
        ArrayList<EnderecoVO> list = new ArrayList<EnderecoVO>();

        try {
            Document doc = builder.build(enderecosXML);
            Element root = (Element) doc.getRootElement();

            Iterator enderecos = root.getChildren("endereco").iterator();

            while (enderecos.hasNext()) {
                Element endereco = (Element) enderecos.next();
                Integer idRestauranteXML = Integer.parseInt(endereco.getChildText("idRestaurante"));

                if (idRestauranteXML.equals(idRestaurante)) {
                    Integer id = Integer.parseInt(endereco.getChildText("id"));
                    String cep = endereco.getChildText("cep");
                    String rua = endereco.getChildText("rua");
                    Integer numero = Integer.parseInt(endereco.getChildText("numero"));
                    String complemento = endereco.getChildText("complemento");

                    EnderecoVO vo = new EnderecoVO(id, idRestaurante, cep, rua, numero, complemento);
                    list.add(vo);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JDOMException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
