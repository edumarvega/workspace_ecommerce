<%@ include file="/pages/template/taglibs.jsp" %>

<div id="divPrint">
	<br>
    	<table>
    		<tr>
    			<td><b><p>N&#176; de pedido:</p></b></td><td><p>&nbsp;<s:property value="numeroPedido"/></p></td>
    		</tr>
    		<tr>
    			<s:date name="fechaActual" var="fechaActual" format="dd/MM/yyyy"/>
    			<td><b><p>Fecha:</p></b></td><td><p>&nbsp;<s:property value="%{#fechaActual}"/></p></td>
    		</tr>
    		<tr>
    			<td><b><p>Total del pedido:</p></b></td><td><p>&nbsp;$<s:property value="totalPedido"/></p></td>
    		</tr>
    		<tr>
    			<td><b><p>Apellido:</p></b></td><td><p>&nbsp;<s:property value="apellido"/></p></td>
    		</tr>
    			<td><b><p>Nombres:</p></b></td><td><p>&nbsp;<s:property value="nombres"/></p></td>
    		</tr>
    		<tr>
    			<td><b><p>Direccion:</p></b></td><td><p>&nbsp;<s:property value="direccion"/></p></td>
    		</tr>
    		<tr>
	   			<td><b><p>Telefono:</p></b></td><td><p>&nbsp;<s:property value="telefono"/></p></td>
    		</tr>
    		<tr>
	   			<td><b><p>Email:</p></b></td><td><p>&nbsp;<s:property value="email"/></p></td>
    		</tr>
   		 </table>
</div>
