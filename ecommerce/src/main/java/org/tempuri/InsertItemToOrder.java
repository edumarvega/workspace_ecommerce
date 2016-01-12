
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
 *         &lt;element name="idPedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idArticulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precioUnitario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subtotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "idPedido",
    "idArticulo",
    "cantidad",
    "precioUnitario",
    "subtotal"
})
@XmlRootElement(name = "insertItemToOrder")
public class InsertItemToOrder {

    protected int idPedido;
    protected int idArticulo;
    protected double cantidad;
    protected double precioUnitario;
    protected double subtotal;

    /**
     * Gets the value of the idPedido property.
     * 
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Sets the value of the idPedido property.
     * 
     */
    public void setIdPedido(int value) {
        this.idPedido = value;
    }

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

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the precioUnitario property.
     * 
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Sets the value of the precioUnitario property.
     * 
     */
    public void setPrecioUnitario(double value) {
        this.precioUnitario = value;
    }

    /**
     * Gets the value of the subtotal property.
     * 
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the value of the subtotal property.
     * 
     */
    public void setSubtotal(double value) {
        this.subtotal = value;
    }

}
