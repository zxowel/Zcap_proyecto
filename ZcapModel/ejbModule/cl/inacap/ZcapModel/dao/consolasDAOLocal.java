package cl.inacap.ZcapModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.ZcapModel.dto.consola;

@Local
public interface consolasDAOLocal {
	
	void save(consola consola);
	List<consola> getAll();
	void delete(consola consola);
	List<consola> filterByName(String nombre);
}
