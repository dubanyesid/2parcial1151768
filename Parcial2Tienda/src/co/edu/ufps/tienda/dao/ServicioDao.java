package co.edu.ufps.tienda.dao;

import co.edu.ufps.tienda.entity.Servicio;
import co.edu.ufps.tienda.util.Conexion;

public class ServicioDao extends Conexion<Servicio> implements GenericDao<Servicio>{

	public ServicioDao(){
		super(Servicio.class);
	}
}
