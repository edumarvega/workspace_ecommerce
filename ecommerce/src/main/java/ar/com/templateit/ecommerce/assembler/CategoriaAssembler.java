package ar.com.templateit.ecommerce.assembler;

import org.tempuri.Categoria;

import ar.com.templateit.ecommerce.dto.CategoriaDTO;

public class CategoriaAssembler {
	
	public CategoriaAssembler(){
		
	}
	
	public CategoriaDTO getData(Categoria categoria){
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		
		categoriaDTO.setId(Long.parseLong(String.valueOf(categoria.getIdCategoria())));
		
		if(categoria.getDescripcion()!=null){
			categoriaDTO.setDescripcion(categoria.getDescripcion());
		}
		else{
			categoriaDTO.setDescripcion("");
		}
		
		
		categoriaDTO.setIdCategoriaPadre(Long.parseLong(String.valueOf(categoria.getIdCategoriaPadre())));
				
		
		return categoriaDTO;
	}

}
