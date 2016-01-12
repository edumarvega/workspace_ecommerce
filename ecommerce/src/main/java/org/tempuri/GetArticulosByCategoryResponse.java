
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
 *         &lt;element name="getArticulosByCategoryResult" type="{http://tempuri.org/}ArrayOfArticulo" minOccurs="0"/>
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
    "getArticulosByCategoryResult"
})
@XmlRootElement(name = "getArticulosByCategoryResponse")
public class GetArticulosByCategoryResponse {

    protected ArrayOfArticulo getArticulosByCategoryResult;

    /**
     * Gets the value of the getArticulosByCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArticulo }
     *     
     */
    public ArrayOfArticulo getGetArticulosByCategoryResult() {
        return getArticulosByCategoryResult;
    }

    /**
     * Sets the value of the getArticulosByCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArticulo }
     *     
     */
    public void setGetArticulosByCategoryResult(ArrayOfArticulo value) {
        this.getArticulosByCategoryResult = value;
    }

}
