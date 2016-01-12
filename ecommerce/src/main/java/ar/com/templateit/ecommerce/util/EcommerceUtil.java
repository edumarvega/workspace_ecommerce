package ar.com.templateit.ecommerce.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import ar.com.templateit.ecommerce.dto.CategoriaDTO;
import ar.com.templateit.ecommerce.dto.ProductoDTO;



public class EcommerceUtil {
	
	public static List<CategoriaDTO> getCategorias(){
		
		List<CategoriaDTO> lista = new ArrayList<CategoriaDTO>();
		
		CategoriaDTO cat1 = new CategoriaDTO();
		cat1.setId(new Long(1));
		cat1.setDescripcion("Bebida");
		
		CategoriaDTO cat2 = new CategoriaDTO();
		cat2.setId(new Long(2));
		cat2.setDescripcion("Alamacen");
		
		CategoriaDTO cat3 = new CategoriaDTO();
		cat3.setId(new Long(3));
		cat3.setDescripcion("Lacteos");
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		
		return lista;
		
	}
	
	public static List<ProductoDTO> getProductos(){
		
		CategoriaDTO cat1 = new CategoriaDTO();
		cat1.setId(new Long(1));
		cat1.setDescripcion("Bebida");
		
		CategoriaDTO cat2 = new CategoriaDTO();
		cat2.setId(new Long(2));
		cat2.setDescripcion("Alamacen");
		
		CategoriaDTO cat3 = new CategoriaDTO();
		cat3.setId(new Long(3));
		cat3.setDescripcion("Lacteos");
		
		List<ProductoDTO> lista = new ArrayList<ProductoDTO>();
		
		ProductoDTO prod1 = new ProductoDTO();
		prod1.setId(new Long(1));
		prod1.setDescripcion("Agua mineral");
		prod1.setCodigo(new Long(7777777777777l));
		prod1.setCategoria(cat1);
		prod1.setDescripcion("Agua mineral sin sodio");
		prod1.setPrecio(new BigDecimal("10.20"));
		
		ProductoDTO prod2 = new ProductoDTO();
		prod2.setId(new Long(2));
		prod2.setCodigo(new Long(8888888888888l));
		prod2.setCategoria(cat2);
		prod2.setDescripcion("Jabon liquido");
		prod2.setPrecio(new BigDecimal("20.00"));
		
		ProductoDTO prod3 = new ProductoDTO();
		prod3.setId(new Long(3));
		prod3.setCodigo(new Long(9999999999999l));
		prod3.setCategoria(cat3);
		prod3.setDescripcion("Arroz integral");
		prod3.setPrecio(new BigDecimal("13.50"));
		
		lista.add(prod1);
		lista.add(prod2);
		lista.add(prod3);
		
		return lista;
		
	}
	
	public static String crearPathImg(String pathTmp){
		
		String separator = "/";
        String pathImg = "img";
        String finalPath = pathTmp+separator+pathImg;
		
		return finalPath;
	}
	
	public static String crearImg(String pathImage, byte[] image,String nameArticulo){
		String extensionImg = ".jpg";
		String separator ="/";
		String img = "img";
		String nameImage="";
		
		if(image!=null){
			InputStream in = new ByteArrayInputStream(image);
			BufferedImage bImageFromConvert;
			try {
				nameImage = pathImage+separator+nameArticulo+extensionImg;
				bImageFromConvert = ImageIO.read(in);
				ImageIO.write(bImageFromConvert, "jpg", new File(nameImage));
				nameImage = img+separator+nameArticulo+extensionImg;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		return nameImage;
	}
	
	public static BigDecimal formatearPrecio(double precio){
		DecimalFormat decimales = new DecimalFormat("0.00");
		String precioFormateado = decimales.format(precio).replace(",",".");
		BigDecimal nuevoPrecio = new BigDecimal(precioFormateado);
	    return nuevoPrecio;
	     
	}

}
