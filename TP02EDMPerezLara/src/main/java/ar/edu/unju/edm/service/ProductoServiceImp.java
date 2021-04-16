package ar.edu.unju.edm.service;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;
@Service
public class ProductoServiceImp implements IProductoService {
	
	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);
	//Como se hace la solucion del problema
	
	@Autowired
	Producto unProducto;
	
	//estructura que guarda
	ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto unProducto) {
		// TODO Auto-generated method stub
		//escribe en la consola
		System.out.println(unProducto.getNombre());
		listaDeProductos.add(unProducto);
		
		// línea de control
		//cantidad de elementos hay en el arreglo
		System.out.println(listaDeProductos.size());
		
		LOGGER.info("METHOD: ingresando a Guardar Producto");
		LOGGER.info("RESULT: guardado " + listaDeProductos.get(listaDeProductos.size()-1).getNombre());
	}

	@Override
	public void modificarProducto(Producto productoAModificar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUnProducto(Producto productoAEliminar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto obtenerUnProducto(String NombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Producto> obtenerTodosProductos() {
		
		// TODO Auto-generated method stub
	return listaDeProductos;
		//return null;
	}

	@Override
	public Producto obtenerProductoNuevo() {
		// TODO Auto-generated method stub
		return unProducto;
	}
	@Override
	public Producto obtenerUltimoProducto() {
		// TODO Auto-generated method stub
	int i = listaDeProductos.size() - 1;
		return listaDeProductos.get(i);
	}
}