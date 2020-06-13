/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbmnet;

import bbmnet.util.BBMNatFactory;
import bbmnet.util.SOAPHandlerImp;
import java.util.List;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

/**
 *
 * @author jtmir
 */
public class BBMNet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BBMNatFactory factory
                = BBMNatFactory
                .createBBMNatFactory(new SOAPHandlerImp("cesarprg", "Licita18"));        
        System.out.println(factory.consultarUnidadesMedida());

    }

}
