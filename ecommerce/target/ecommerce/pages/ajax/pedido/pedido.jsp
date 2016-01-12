<%@ include file="/pages/template/taglibs.jsp" %>
<s:url action="jsonCaptcha_obtenerCaptcha" namespace="/" var="obtenerCaptcha" />
  <script type="text/javascript">
  	$(document).ready(function(){

  		var options = { 
  		  		target : '#divComprobante',
  		  		beforeSubmit:  function(){
  		  			divPedido.block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
				},
			    success:    function(){
			    	divPedido.unblock();
			    	showModalComprobante();
			    	divPedido.dialog('close');
			    } 
		};
  		
  		$('#formPedido').submit(function() {
  	        $(this).ajaxSubmit(options);
  	        return false;
  	    });
  		
  		
  		
  		$('#buttonCaptcha').on('click', function() {
  			  			
  			$.ajax({
				url: '${obtenerCaptcha}',
				cache: false,
				type:  'GET',
				dataType: 'json',
				success:  function(data){
					$('#captcha').text(data);
				}
			});
  	       
  	    });
  		
  		
  		$("#codigo").keyup(function(){
  			var captcha = $('#captcha').text();
  			var codigoIngresado = $(this).val();
  	  		var valorActual = $(this).val().length;
  	  		
  	  		if(valorActual>5){
  	  			if(captcha===codigoIngresado){
  	  				$('#buttonEnviar').prop('disabled', false);
  	  				$('#buttonCaptcha').prop('disabled', true);
  	  			}
  	  			else{
  	  				$('#errorCaptcha').show();
  	  			}
  	  			
  	  	  	}
  	  	  	else{
  	  	  		$('#buttonEnviar').prop('disabled', true);
  	  	  		$('#errorCaptcha').hide();
  	  	  		$('#buttonCaptcha').prop('disabled', false);
  	  	  	}
  		});
  		
  		  		
  		
 	});
   </script>
   

	<s:form id="formPedido"  action="pedido_sendPedido" theme="simple"  cssClass="form-horizontal" role="form"><br>
		
  		<div class="form-group">
    		<label for="apellido" class="col-sm-4 control-label">Apellido</label>
    		<div class="col-sm-5">
      			<input type="text" class="form-control input-sm" id="apellido" name="apellido" value="" required autofocus>
    		</div>
  		</div>
  		<div class="form-group">
    		<label for="nombre" class="col-sm-4 control-label">Nombres</label>
    		<div class="col-sm-5">
      			<input type="text" class="form-control input-sm" id="nombres" name="nombres" value="" required>
    		</div>
  		</div>
  		<div class="form-group">
    		<label for="direccion" class="col-sm-4 control-label">Direcci&oacute;n</label>
    		<div class="col-sm-7">
      			<input type="text" class="form-control input-sm" id="direccion" name="direccion" value="" required>
    		</div>
  		</div>
  		<div class="form-group">
    		<label for="telefono" class="col-sm-4 control-label">Tel&eacute;fono</label>
    		<div class="col-sm-5">
      			<input type="text" class="form-control input-sm" id="telefono" name="telefono" value="" required>
    		</div>
  		</div>
  		<div class="form-group">
    		<label for="direccion" class="col-sm-4 control-label">Email</label>
    		<div class="col-sm-7">
      			<input type="text" class="form-control input-sm" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" value="" required>
    		</div>
  		</div>
  		<div class="form-group">
    		<label for="captcha" class="col-sm-4 control-label"></label>
    		<div class="col-sm-5">
    			<div class="input-group">
    				<span id="captcha" class="texto-captcha"><s:property value="captcha"/></span>&nbsp; 
    				<button id="buttonCaptcha" type="button" class="btn btn-success"><span class="glyphicon glyphicon-refresh"></span>&nbsp;Captcha</button><br>
    			</div>	
	   		</div>
  		</div>
  		<div class="form-group">
    		<label for="codigo" class="col-sm-4 control-label">C&oacute;digo captcha</label>
    		<div class="col-sm-3">
				<input type="text" class="form-control input-sm" id="codigo" name="codigo" value="" size="6" maxlength="6" required>
    			<span id="errorCaptcha" class="error-captcha" style="display: none;">C&oacute;digo incorrecto</span>
       		</div>
  		</div>
  		
      	<br>
  		  		 		
  		<div class="form-group">
  			<label for="button" class="col-sm-4 control-label"></label>
    		<div class="col-sm-4">
      			<button id="buttonEnviar" type="submit" class="btn btn-info" disabled>Enviar pedido</button>
    		</div>
    	</div>	
    </s:form>

    	
