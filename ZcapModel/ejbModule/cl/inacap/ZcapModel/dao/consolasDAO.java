package cl.inacap.ZcapModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.ZcapModel.dto.consola;

/**
 * Session Bean implementation class consolasDAO
 */
@Stateless
@LocalBean
public class consolasDAO implements consolasDAOLocal {
	
	private static List<consola> consolas = new ArrayList<>();
    /**
     * Default constructor. 
     */

	
	@Override
	public void save(consola consola) {
		consolas.add(consola);
		
	}

	@Override
	public List<consola> getAll() {
		// TODO Auto-generated method stub
		return consolas;
	}

	@Override
	public void delete(consola consola) {
		consolas.remove(consola);
		
	}

	@Override
	public List<consola> filterByName(String nombre) {
		return consolas.stream().filter(c->c.getNombre().contains(nombre))
				.collect(Collectors.toList());
	}

}
