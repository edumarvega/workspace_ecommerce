<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/pages/template/taglibs.jsp" %>
<s:url action="producto_agregarAlCarrito" namespace="/" var="agregarAlCarrito" />
<s:url action="producto_eliminarDelCarrito" namespace="/" var="eliminarDelCarrito" />
<s:url action="producto_vaciarCarrito" namespace="/" var="vaciarCarrito" />
<s:url action="producto_search" namespace="/" var="search" />
<s:url action="pedido_loadPedido" namespace="/" var="loadPedido" />

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>E-commerce</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <%@ include file="/pages/template/common-header.jsp" %>
	<style type="text/css">
		header{
    		background-color: #5bc0de;
		}
		
		.texto-titulo{
			color:#2aabd2; 
			font-size: 17px; 
			font-weight:bold;
		}

		.texto-total{
			font-size: 20px;
		}
		
		.carritoGrillaScroll{
			height: 240px !important;
    		overflow-y: scroll;
    		overflow-x: hidden;
		}
		.categoriaScroll{
			height: 360px !important;
    		overflow-y: scroll;
    		overflow-x: hidden;
		}
		
		.texto-captcha{
			font-family: 'Bitter', serif;
			font-size: 25px;
		}
		.error-captcha{
			color:#FF0000 ;
		}
		
	</style>
	<script type="text/javascript">
  		
	$(document).ready(function(){
			
			changeLinksPagination('resultado','filterForm');
			
			$('.categoria').css('cursor', 'pointer');
						
									
  			var optionsFilter = { 
  				    target:     '#resultado', 
  				    url:        '${search}', 
  				 	beforeSerialize: function($form, options) { 
  				 		$('#idCategoria').val('');
  				        return true;                  
  					},
  				    beforeSubmit:  function(){
  				    	$(".displayTable").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  					},
  				    success:    function(){ 
  						changeLinksPagination('resultado','filterForm');
  				    } 
  			};
  	  		
  			$('#filterForm').submit(function() {
  	  	        $(this).ajaxSubmit(optionsFilter);
  	  	        return false;
  	  	    });
  		
  		});
  		
  		function agregarAlCarrito(id){
  			var cantidad = $('.cantidad'+id).val();
  			if(cantidad.length>0){
  				var url = '${agregarAlCarrito}?id='+id+'&cantidad='+cantidad;
  				$.ajax({
  	  				url:  url,
  	  				cache: false,
  	  				type:  'get',
  	  				beforeSend: function () {
  	  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  	  				},
  	  				success:  function (response) {
  	  					$("#itemsCarrito").html(response);
  	  					$("#itemsCarrito").unblock();
  	  					$('.quitar').css('cursor', 'pointer');
  	  					$('.vaciarCarrito').css('cursor', 'pointer');
  	  				}
  	  		    });	
  			}
  			else{
  				showMsgError('Debe ingresar una cantidad.');
  			}
  			
  			
  		}
  		
  		function eliminar(index){
  			
  			var url = '${eliminarDelCarrito}?index='+index;
  			$.ajax({
  				url:  url,
  				cache: false,
  				type:  'get',
  				beforeSend: function () {
  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  				},
  				success:  function (response) {
  					$("#itemsCarrito").html(response);
  					$("#itemsCarrito").unblock();
  					$('.quitar').css('cursor', 'pointer');
  					$('.vaciarCarrito').css('cursor', 'pointer');
  				}
  		    });
  		}
  		
  		function cargarCategoria(id){
  			
  			var url = '${search}?idCategoria='+id;
  			$.ajax({
  				url:  url,
  				cache: false,
  				type:  'get',
  				beforeSend: function () {
  					$("#resultado").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  				},
  				success:  function (response) {
  					$("#resultado").html(response);
  					$("#resultado").unblock();
  					$('#idCategoria').val(id);
  		  			changeLinksPagination('resultado','filterForm');
  				}
  		    });
  			
  		}
  		
  		function vaciarCarrito(){
  			$.ajax({
  				url:  '${vaciarCarrito}',
  				cache: false,
  				type:  'get',
  				beforeSend: function () {
  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  				},
  				success:  function (response) {
  					$("#itemsCarrito").html(response);
  					$("#itemsCarrito").unblock();
  				}
  		    });
  		}
  		
  		var divPedido;
  	  	function showModalPedido(){
  	  		divPedido = $("#divPedido").dialog({
  				   title: 'Ingreso de datos del pedido',
  				   modal: true,
  				   width: 600,
  				   height: 500,
  				   position: 'center',
  				   hide: "scale",
  				   resizable: 'false'
  				}).load('${loadPedido}',function(){
  						$(this).unblock();
  		  			}).block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  	  	}
  	  	
  	  	var divComprobante;
  	  	function showModalComprobante(){
  	  		divComprobante =$("#divComprobante").dialog({
				   title: 'Comprobante del pedido',
				   modal: true,
				   width: 500,
				   height: 420,
				   position: 'center',
				   hide: "scale",
				   resizable: 'false',
				   beforeClose: function(event, ui) { 
					   
					   $.ajax({
			  				url:  '${vaciarCarrito}',
			  				cache: false,
			  				type:  'get',
			  				beforeSend: function () {
			  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
			  				},
			  				success:  function (response) {
			  					$("#itemsCarrito").html(response);
			  					$("#itemsCarrito").unblock();
			  					 divComprobante.dialog('close');
			  				}
			  		    });
					  
	         	   },
	         	   buttons: {
				   		"Imprimir": function () {
							$("#divPrint").printArea();
					 	}
				   }
				});
	    }
  	  	
  	  	  		
  		
  	</script>
</head>

<body>
	
	<header>
            <img src="img/logo.png" alt="logo" class="img-responsive">
            <br>
    </header>

        <section id="contenido"><br><br>
            
            <div class="container">
                
                <div id="buscador" class="row">
                    <div class="col-md-3 col-lg-3">
                        
                    </div>
                    <div class="col-md-6 col-lg-6">
                        <form id="filterForm" action="producto_search" class="form-inline"  role="form">
                        	<s:hidden id="idCategoria" name="idCategoria" value=""/>
                            <div class="row">
                                <div class="form-group">
                                    <input type="text" id="descripcion" class="form-control input-md" name="descripcion" placeholder="Nombre del producto"  size="50" autofocus>
                                </div>
            
                                <div class="form-group">
                                    <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-search"></span>&nbsp;Buscar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-3 col-lg-3">
                        
                    </div>
                    
                </div><br>
                <div id="data" class="row">
                <hr>
                    <div class="col-md-2 col-lg-2">
                        <span class="texto-titulo">Categorías</span>
                        <br><br>
                        <!--<a href="#">Notebook <span class="badge">12</span></a><br>
                        <a href="#">Tablet <span class="badge">12</span></a><br>
                        <a href="#">Celulares <span class="badge">10</span></a><br>
                        <a href="#">Pendrive <span class="badge">20</span></a><br> -->
                        <s:if test="%{categoriasDTO!=null}">
                        	<s:if test="%{categoriasDTO.size>19}">
                        		<div class="categoriaScroll">
    								<s:iterator value="categoriasDTO">
										<a onclick="cargarCategoria(<s:property value="id"/>);return false;" class="categoria"><s:property value="descripcion"/></a><br>                 
       								</s:iterator>
       							</div>		
       						</s:if>	
       						<s:else>
       							<s:iterator value="categoriasDTO">
									<a onclick="cargarCategoria(<s:property value="id"/>);return false;" class="categoria"><s:property value="descripcion"/></a><br>                 
       							</s:iterator>
							</s:else>
       					</s:if>	
       					
                    </div>
                    <div class="col-md-6 col-lg-6">
                        <span class="texto-titulo">Resultado</span><br><br>
                        <!--<div id="resultado">
                        	<table id="tableProductos" class="table table-striped table-condensed">
                            	<tbody>
                                	<tr>      
                                    	<td><img src="img/hp.png" width="140px" height="100px"></td>
                                    	<td><p>Notebook HP</p>
                                        	<p>I5 core</p>
                                        	<p>$23.000</p></td>
                                	</tr>
                                	<tr>      
                                    	<td colspan="2"><button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Agregar</button></td>
                                	</tr>
                                	<tr>      
                                    	<td><img src="img/macbook.jpg" width="140px" height="100px"></td>
                                    	<td><p>Macbook Pro</p>
                                        	<p>I5 core</p>
                                        	<p>$33.000</p></td>
                                	</tr>
                                	<tr>      
                                    	<td colspan="2"><button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Agregar</button></td>
                                	</tr>
                            	</tbody>
                        	</table>
                    	</div>-->
                    	<div id="resultado">
							<%@ include file="/pages/ajax/producto/resultadoProductos.jsp"%>
						</div>    
                    </div>
                    <div class="col-md-4 col-lg-4">
                        <div class="row">
                            <div class="col-md-12 col-lg-12">
                                <span class="texto-titulo">Tu pedido:</span>
                                <img src="img/carrito.png" alt="carrito" class="img-responsive center-block" width="80px" height="80px">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-lg-12">
                            
                            	<!--<div class="carritoGrillaScroll">
                                	<table id="tableProductos" class="table table-striped table-condensed">
                                    	<thead>
                                        	<tr>
                                            	<th>Cant.</th>
                                            	<th>Nombre</th>
                                            	<th>Descripcion</th>
                                            	<th>Precio</th>
                                            	<th></th>
                                        	</tr>
                                    	</thead>
                                     	<tbody>
                                        	<tr>      
                                            	<td>1</td>
                                            	<td>Notebook</td>
                                            	<td>13" i5 core</td>
                                            	<td>$23.000</td>
                                            	<td><a>[Quitar]</a></td>                 
                                        	</tr>
                                        	<tr>      
                                            	<td>1</td>
                                            	<td>Notebook</td>
                                            	<td>11" HP</td>
                                            	<td>$33.000</td>
                                            	<td><a>[Quitar]</a></td>                 
                                        	</tr>
                                    	</tbody>
                                	</table>
                                </div> -->
                                
                                <div id="itemsCarrito" class="form-group">
  									<%@ include file="/pages/ajax/producto/grillaCarrito.jsp"%>
    							</div>
                              
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>
            
        </section>
        
        <footer>
            <p class="text-center">www.limaku.com.ar</p>
        </footer>
   		<div id="divPedido" style="display: none;"></div>
		<div id="divComprobante" style="display: none;"></div>
		<%@ include file="/pages/template/dialogs.jsp"%>
	    
</body>
</html>