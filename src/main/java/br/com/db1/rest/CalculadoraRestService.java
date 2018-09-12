package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraRestService {

	@GET
	@Path("/somar/{parametro1}/{parametro2}")
	public Response somar(
			@PathParam("parametro1") Integer parametro1,
			@PathParam("parametro2") Integer parametro2){
			
		Integer resultado = parametro1 + parametro2;
		
		String result = "Resultado: " + resultado;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/subtrair/{parametro1}/{parametro2}")
	public Response subtrair(
			@PathParam("parametro1") Integer parametro1,
			@PathParam("parametro2") Integer parametro2){
			
		Integer resultado = parametro1 - parametro2;
		
		String result = "Resultado: " + resultado;
		
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/dividir/{parametro1}/{parametro2}")
	public Response dividir(
			@PathParam("parametro1") Integer parametro1,
			@PathParam("parametro2") Integer parametro2){
			
		Integer resultado = parametro1 / parametro2;
		
		String result = "Resultado: " + resultado;
		
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/multiplicar/{parametro1}/{parametro2}")
	public Response multiplicar(
			@PathParam("parametro1") Integer parametro1,
			@PathParam("parametro2") Integer parametro2){
			
		Integer resultado = parametro1 * parametro2;
		
		String result = "Resultado: " + resultado;
		
		return Response.status(200).entity(result).build();
	}
	
}
