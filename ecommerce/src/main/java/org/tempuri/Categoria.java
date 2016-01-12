
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Categoria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Categoria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdCategoria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subcategorias" type="{http://tempuri.org/}ArrayOfCategoria" minOccurs="0"/>
 *         &lt;element name="IdCategoriaPadre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Categoria", propOrder = {
    "idCategoria",
    "descripcion",
    "subcategorias",
    "idCategoriaPadre"
})
public class Categoria {

    @XmlElement(name = "IdCategoria")
    protected int idCategoria;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "Subcategorias")
    protected ArrayOfCategoria subcategorias;
    @XmlElement(name = "IdCategoriaPadre")
    protected int idCategoriaPadre;

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
     * Gets the value of the subcategorias property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoria }
     *     
     */
    public ArrayOfCategoria getSubcategorias() {
        return subcategorias;
    }

    /**
     * Sets the value of the subcategorias property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoria }
     *     
     */
    public void setSubcategorias(ArrayOfCategoria value) {
        this.subcategorias = value;
    }

    /**
     * Gets the value of the idCategoriaPadre property.
     * 
     */
    public int getIdCategoriaPadre() {
        return idCategoriaPadre;
    }

    /**
     * Sets the value of the idCategoriaPadre property.
     * 
     */
    public void setIdCategoriaPadre(int value) {
        this.idCategoriaPadre = value;
    }

}
