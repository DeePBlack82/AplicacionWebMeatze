package es.meatze.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="login")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="contra")
	private String contra;
		
	@Column(name="codigo")
	private Centro codigo;

	@Autowired
	private static SessionFactory sessionFactory;
	
	public Login() {
		super();
	}

	public Login(String usuario, String contra, Centro codigo) {
		super();
		this.usuario = usuario;
		this.contra = contra;
		this.codigo = codigo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public Centro getCodigo() {
		return codigo;
	}

	public void setCodigo(Centro codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Login [usuario=" + usuario + ", contra=" + contra + ", codigo=" + codigo + "]";
	}

	
		
	

}
