//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.07.17 alle 10:47:34 AM CEST 
//


package it.larus.jqassistant.plugin.nmap.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "smurf")
public class Smurf {

    @XmlAttribute(name = "responses", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String responses;

    /**
     * Recupera il valore della proprietà responses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponses() {
        return responses;
    }

    /**
     * Imposta il valore della proprietà responses.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponses(String value) {
        this.responses = value;
    }

}
