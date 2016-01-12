package ar.com.templateit.ecommerce.dto;

import java.io.Serializable;
import java.util.List;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 8776976815360574229L;
	private Long id;
	private String descripcion;
	private List<CategoriaDTO> subcategorias;
	private Long idCategoriaPadre;
	
	public CategoriaDTO(){
		
	}
	
	public CategoriaDTO(Long id,String descripcion,List<CategoriaDTO> subcategorias,Long idCategoriaPadre){
		this.id = id;
		this.descripcion = descripcion;
		this.subcategorias = subcategorias;
		this.idCategoriaPadre = idCategoriaPadre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<CategoriaDTO> getSubcategorias() {
		return subcategorias;
	}

	public void setSubcategorias(List<CategoriaDTO> subcategorias) {
		this.subcategorias = subcategorias;
	}

	public Long getIdCategoriaPadre() {
		return idCategoriaPadre;
	}

	public void setIdCategoriaPadre(Long idCategoriaPadre) {
		this.idCategoriaPadre = idCategoriaPadre;
	}
	
	

		
	

}
