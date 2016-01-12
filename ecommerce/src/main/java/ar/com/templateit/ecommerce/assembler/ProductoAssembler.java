package ar.com.templateit.ecommerce.assembler;

import java.math.BigDecimal;

import org.tempuri.Articulo;

import ar.com.templateit.ecommerce.dto.CategoriaDTO;
import ar.com.templateit.ecommerce.dto.ProductoDTO;
import ar.com.templateit.ecommerce.util.EcommerceUtil;

public class ProductoAssembler {
	
	public ProductoAssembler(){
		
	}
	
	public ProductoDTO getData(Articulo articulo,CategoriaDTO categoriaDTO,String pathImage){
		ProductoDTO productoDTO = new ProductoDTO();
		
		productoDTO.setId(Long.parseLong(String.valueOf(articulo.getIdArticulo())));
		
		if(articulo.getDescripcion()!=null){
			productoDTO.setDescripcion(articulo.getDescripcion());
		}
		else{
			productoDTO.setDescripcion("");
		}
		
		BigDecimal precio = EcommerceUtil.formatearPrecio(articulo.getPrecioSugerido());
					       
		productoDTO.setPrecio(precio);
		productoDTO.setCategoria(categoriaDTO);
		productoDTO.setPathImage(pathImage);
		
		return productoDTO;
	}

}
