package es.meatze.DAO;

import java.util.List;

import es.meatze.entity.Ordenador;

public interface OrdenadorDAO {

	public List<Ordenador> getAllPCs();
	public List<Ordenador> getPCsCentro();
	public List<Ordenador> getPCsAulaCentro();
	
}
