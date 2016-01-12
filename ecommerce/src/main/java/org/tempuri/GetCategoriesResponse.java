
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
 *         &lt;element name="getCategoriesResult" type="{http://tempuri.org/}ArrayOfCategoria" minOccurs="0"/>
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
    "getCategoriesResult"
})
@XmlRootElement(name = "getCategoriesResponse")
public class GetCategoriesResponse {

    protected ArrayOfCategoria getCategoriesResult;

    /**
     * Gets the value of the getCategoriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoria }
     *     
     */
    public ArrayOfCategoria getGetCategoriesResult() {
        return getCategoriesResult;
    }

    /**
     * Sets the value of the getCategoriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoria }
     *     
     */
    public void setGetCategoriesResult(ArrayOfCategoria value) {
        this.getCategoriesResult = value;
    }

}
