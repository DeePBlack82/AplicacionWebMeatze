package es.meatze.DAO;

import java.util.List;

import es.meatze.entity.Periferico;

public interface PerifericoDAO {

	public List<Periferico> getAllPerifericos();
	public List<Periferico> getPerifericosCentro();
	public List<Periferico> getPerifericosAulaCentro();
	
}
