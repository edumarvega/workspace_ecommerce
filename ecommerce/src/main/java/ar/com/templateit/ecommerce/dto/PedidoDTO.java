package ar.com.templateit.ecommerce.dto;

import java.io.Serializable;
import java.util.List;

public class PedidoDTO implements Serializable{
	
	private static final long serialVersionUID = -1875320059693659962L;
	private Long id;
	private String apellido;
	private String nombres;
	private String direccion;
	private String telefono;
	private String email;
	private List<DetallePedidoDTO> detallePedido;
	
	public PedidoDTO(){

	}
	
	public PedidoDTO(Long id, String apellido, String nombres, String direccion,
					String telefono, String email, List<DetallePedidoDTO> detallePedido){
		this.id=id;
		this.apellido=apellido;
		this.nombres=nombres;
		this.direccion=direccion;
		this.telefono=telefono;
		this.email=email;
		this.detallePedido=detallePedido;

	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<DetallePedidoDTO> getDetallePedido() {
		return detallePedido;
	}

	public void setDetallePedido(List<DetallePedidoDTO> detallePedido) {
		this.detallePedido = detallePedido;
	}
	
	

}
