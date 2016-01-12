
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Articulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Articulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdArticulo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrecioSugerido" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IdCategoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Articulo", propOrder = {
    "idArticulo",
    "descripcion",
    "precioSugerido",
    "idCategoria"
})
public class Articulo {

    @XmlElement(name = "IdArticulo")
    protected int idArticulo;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "PrecioSugerido")
    protected double precioSugerido;
    @XmlElement(name = "IdCategoria")
    protected int idCategoria;

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
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the precioSugerido property.
     * 
     */
    public double getPrecioSugerido() {
        return precioSugerido;
    }

    /**
     * Sets the value of the precioSugerido property.
     * 
     */
    public void setPrecioSugerido(double value) {
        this.precioSugerido = value;
    }

    /**
     * Gets the value of the idCategoria property.
     * 
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * Sets the value of the idCategoria property.
     * 
     */
    public void setIdCategoria(int value) {
        this.idCategoria = value;
    }

}
