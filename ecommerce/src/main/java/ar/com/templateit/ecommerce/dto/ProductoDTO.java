package ar.com.templateit.ecommerce.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductoDTO implements Serializable{

	private static final long serialVersionUID = -1327977104589394025L;
	private Long id;
	private Long codigo;
	private String descripcion;
	private CategoriaDTO categoria;
	private BigDecimal precio;
	private String pathImage;
	
	
	public ProductoDTO(){
		
	}
	
	public ProductoDTO(Long id, Long codigo, String descripcion, CategoriaDTO categoria,	
						BigDecimal precio,	Integer cantidad,String pathImage){
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.pathImage = pathImage;
				
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

			

}
