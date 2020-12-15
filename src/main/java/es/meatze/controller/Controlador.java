package es.meatze.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import es.meatze.DAO.AulaDAO;
import es.meatze.DAO.CentroDAO;
import es.meatze.DAO.OrdenadorDAO;
import es.meatze.DAO.PerifericoDAO;



@Controller
@RequestMapping("/login")
public class Controlador {

	@Autowired
	private OrdenadorDAO ordenadorDAO;
	
	@Autowired
	private PerifericoDAO perifericoDAO;
	
	@Autowired
	private CentroDAO centroDAO;
	
	@Autowired
	private AulaDAO aulaDAO;
	
	
	
	
	
	
	
	
	@RequestMapping("/prueba")
	public String prueba(Model elModelo) {
		
		// Obtener los centros desde el DAO
		List<String> losCentros = centroDAO.getNombresCentros();
						
						
		// Agregar los centros al modelo
		elModelo.addAttribute("centros", losCentros);
		
		
		
		
		return "pruebaSelect";
	}
	
	
	@RequestMapping("/formularioOrdenador")
	public String muestraFormularioOrdenador(Model elModelo) {
		
		Ordenador elOrdenador = new Ordenador();
		
		elModelo.addAttribute("buscaOrd", elOrdenador);
		
		return "FormularioOrdenador";
		
	}
	
	@RequestMapping("/formularioPeriferico")
	public String muestraFormularioPeriferico(Model elModelo) {
		
		Periferico elPeriferico = new Periferico();
		
		elModelo.addAttribute("buscaPeri", elPeriferico);
		
		return "FormularioPeriferico";
		
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/centro")
	public String listaCentros(Model elModelo) {
		
		// Obtener los centros desde el DAO
		List<Centro> losCentros = centroDAO.getCentros();
				
				
		// Agregar los centros al modelo
		elModelo.addAttribute("centros", losCentros);
				
		return "lista-centros" /*"FormularioOrdenador"*/;
		
	}
	
	@RequestMapping("/aula")
	public String listaAulas(Model elModelo) {
		
		return "lista-aulas";
		
	}
		
	@RequestMapping("/pc")
	public String listaPCs(Model elModelo) {
		
		// Obtener los ordenadores desde el DAO
		List<Ordenador> losOrdenadores = pcDAO.getPCs();
		
		
		// Agregar los ordenadores al modelo
		elModelo.addAttribute("ordenadores", losOrdenadores);
		
		return "lista-PCs";
		
	}
	
	@RequestMapping("/periferico")
	public String listaPerifericos(Model elModelo) {
		
		return "lista-perifericos";
		
	}
	
}
