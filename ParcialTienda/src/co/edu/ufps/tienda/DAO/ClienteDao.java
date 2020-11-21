package co.edu.ufps.tienda.DAO;
import co.edu.ufps.tienda.DAO.GenericDao;
import co.edu.ufps.tienda.entity.Cliente;
import co.edu.ufps.tienda.util.Conexion;

public class ClienteDao extends Conexion<Cliente> implements GenericDao<Cliente>{

	public ClienteDao(){
		super(Cliente.class);
	}
}

