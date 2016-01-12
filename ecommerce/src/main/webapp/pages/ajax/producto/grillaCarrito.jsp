<%@ include file="/pages/template/taglibs.jsp" %>
<br>
<div class="carritoGrillaScroll">
	<table id="tableProductos" class="table table-striped table-condensed">
		<thead>
			<tr>
				<th>Descripci&oacuten</th>
				<th>Cant.</th>
				<th>Precio</th>
				<th>Subtotal</th>
				
				
				<th></th>
			</tr>
		</thead>
		<tbody>
			<s:if test="%{detallePedidoDTO.size>0}">
    			<s:iterator value="detallePedidoDTO" status="item">
					<tr>
						<td><s:property value="descripcion"></s:property></td>
           				<td><s:property value="cantidad"></s:property></td>
           				<td>$<s:property value="precio"></s:property></td>
           				<td>$<s:property value="subTotal"></s:property></td>
           				
           				<td><a onclick="eliminar(<s:property value="%{#item.index}" />);return false;" class="quitar">[Quitar]</a></td>                 
       				</tr>
       			</s:iterator>
			</s:if>
		</tbody>
	</table>
</div>
<s:if test="%{detallePedidoDTO.size>0}">
	<a onclick="vaciarCarrito();return false;" class="vaciarCarrito">[Vaciar carrito]</a><br> 
	<p class="text-right texto-total"><strong>TOTAL $<s:property value="totalVenta"/></strong></p> 
	<button id="buttonPedido" type="button" class="btn btn-info" onclick="showModalPedido();return false;"><span class="glyphicon glyphicon-pencil"></span>&nbsp;Generar pedido</button>
</s:if>	
