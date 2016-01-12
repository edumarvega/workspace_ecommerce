package ar.com.templateit.ecommerce.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class DetallePedidoDTO implements Serializable{

	private static final long serialVersionUID = -3087274516238243072L;
	private Long id;
	private Long codigo;
	private String descripcion;
	private String categoria;
	private BigDecimal precio;
	private Integer cantidad;
	private BigDecimal subTotal;
	private PedidoDTO pedido;

	public DetallePedidoDTO(){
		
	}
	
	public DetallePedidoDTO(Long id, Long codigo, String descripcion, String categoria, BigDecimal precio,
							Integer cantidad, BigDecimal subTotal, PedidoDTO pedido){
		
		this.id=id;
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.categoria=categoria;
		this.precio=precio;
		this.cantidad=cantidad;
		this.subTotal=subTotal;
		this.pedido=pedido;

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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}
	
	
	
	
}
