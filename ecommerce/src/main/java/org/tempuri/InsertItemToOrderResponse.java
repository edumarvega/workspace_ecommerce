
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
 *         &lt;element name="insertItemToOrderResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "insertItemToOrderResult"
})
@XmlRootElement(name = "insertItemToOrderResponse")
public class InsertItemToOrderResponse {

    protected int insertItemToOrderResult;

    /**
     * Gets the value of the insertItemToOrderResult property.
     * 
     */
    public int getInsertItemToOrderResult() {
        return insertItemToOrderResult;
    }

    /**
     * Sets the value of the insertItemToOrderResult property.
     * 
     */
    public void setInsertItemToOrderResult(int value) {
        this.insertItemToOrderResult = value;
    }

}
