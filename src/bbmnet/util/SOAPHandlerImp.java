/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbmnet.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author jtmir
 */
public class SOAPHandlerImp implements SOAPHandler<SOAPMessageContext> {
    
    private final String user;
    private final String password;

    public SOAPHandlerImp(String user, String password) {
        this.user = user;
        this.password = password;
    }    
    

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        SOAPMessage msg = context.getMessage();
        try {
            SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();
            SOAPHeader header;
            if (envelope.getHeader() == null) {
                header = envelope.addHeader();
            }else{
                header = envelope.getHeader();                
            }
            SOAPElement webUser = header.addChildElement(new QName("ns", "web-user", "ns1"));
            webUser.addTextNode(this.user);
            SOAPElement webPassword = header.addChildElement(new QName("ns", "web-password", "ns1"));
            webPassword.addTextNode(this.password);
        } catch (SOAPException ex) {
            Logger.getLogger(SOAPHandlerImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {
    }

}
