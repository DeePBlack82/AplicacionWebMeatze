package es.meatze.entity;

import java.util.List;

import javax.persistence.*;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="aula")
public class Aula {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_aula")
	private String id_aula;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_centro")
	private Centro centro;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "aula")
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Periferico> perifericosAula;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "aula")
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Ordenador> ordenadoresAula;
	
	@Autowired
	private static SessionFactory sessionFactory;
	
	
	public Aula() {
		super();
	}

	public Aula(String id_aula, String nombre) {
		super();
		this.id_aula = id_aula;
		this.nombre = nombre;
	}

	public String getId_aula() {
		return id_aula;
	}

	public void setId_aula(String id_aula) {
		this.id_aula = id_aula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}
		
	public List<Periferico> getPerifericosAula() {
		return perifericosAula;
	}

	public void setPerifericosAula(List<Periferico> perifericosAula) {
		this.perifericosAula = perifericosAula;
	}

	public List<Ordenador> getOrdenadoresAula() {
		return ordenadoresAula;
	}

	public void setOrdenadoresAula(List<Ordenador> ordenadoresAula) {
		this.ordenadoresAula = ordenadoresAula;
	}

	@Override
	public String toString() {
		return "Aula [id_aula=" + id_aula + ", nombre=" + nombre + ", centro=" + centro + "]";
	}

	
	
	
	
	
}
