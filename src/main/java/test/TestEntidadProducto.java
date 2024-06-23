package test;

import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		/*
		//Testeamos el metodo registrar
		producto.setNombrecl2("Gloria");
		producto.setPrecioventacl2(6.50);
		producto.setPreciocompcl2(5.00);
		producto.setEstadocl2("Bueno");
		producto.setDescripcl2("Leche Gloria");
		crud.RegistrarProducto(producto);
		
		*/
		//Testeamos el metodo listar
		List<TblProductocl2> listarProducto = crud.ListarProducto();
		for(TblProductocl2 p:listarProducto){
			System.out.println("Codigo: "+p.getIdproductocl2()+"\n"+
								"Nombre: "+p.getNombrecl2()+"\n"+
								"Precio de Venta: "+p.getPrecioventacl2()+"\n"+
								"Precio de Compra: "+p.getPreciocompcl2()+"\n"+
								"Estado: "+p.getEstadocl2()+"\n"+
								"Descripcion: "+p.getDescripcl2()+"\n");			
		}//fin del bucle for
	
	}

}

