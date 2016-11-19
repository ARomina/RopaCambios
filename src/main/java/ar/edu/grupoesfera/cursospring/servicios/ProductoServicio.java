package ar.edu.grupoesfera.cursospring.servicios;

import java.util.Set;

import ar.edu.grupoesfera.cursospring.modelo.Producto;
public interface ProductoServicio {

	public Boolean buscaProducto(Producto producto) throws Exception;
	public void guardaProductoExistente(Producto producto);
	public Boolean altaProducto(Producto producto)throws Exception;
	public Set<Producto> verProductos();
	public Boolean bajaProducto(Producto producto)throws Exception;
	public void modificacionProducto(Producto producto);
	public Set<Producto> verProductosPorCategoria(Producto producto, String categoria);
	public Set<Producto> verProductosNovedades(Producto producto);
	
	/*
	Boolean altaProducto();
	Boolean bajaProducto();
	void guardaProductoExistente();
	void modificacionProducto();
	Set<Producto> verProductos();
	Boolean buscaProducto();
	void guardaImagen();
	Producto mostrarImagen();
	Set<Producto> verProductosPorCategoria();
	Set<Producto> verProductosNovedades();*/
	
}
