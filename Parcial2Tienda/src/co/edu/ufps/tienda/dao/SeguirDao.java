package co.edu.ufps.tienda.dao;

import co.edu.ufps.tienda.entity.Seguir;
import co.edu.ufps.tienda.util.Conexion;

public class SeguirDao extends Conexion<Seguir> implements GenericDao<Seguir>{

	public SeguirDao(){
		super(Seguir.class);
	}
}
