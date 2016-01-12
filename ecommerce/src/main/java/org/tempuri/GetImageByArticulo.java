
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idArticulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idArticulo"
})
@XmlRootElement(name = "getImageByArticulo")
public class GetImageByArticulo {

    protected int idArticulo;

    /**
     * Gets the value of the idArticulo property.
     * 
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * Sets the value of the idArticulo property.
     * 
     */
    public void setIdArticulo(int value) {
        this.idArticulo = value;
    }

}
