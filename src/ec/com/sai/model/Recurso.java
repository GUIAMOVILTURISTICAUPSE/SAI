package ec.com.sai.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Recurso {
	@Getter @Setter private long id;
	@Getter @Setter private String rev;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String informacionGeneral;
	@Getter @Setter private String direccion;
	@Getter @Setter private String coordenadas;
	@Getter @Setter private String documentClass;
	@Getter @Setter private String propietario;
	@Getter @Setter private String estado;
	@Getter @Setter private Seguridad seguridad;
	@Getter @Setter private Categoria categoria;
	@Getter @Setter private Ranking ranking;
	@Getter @Setter private ArrayList<Costo> costos;
	@Getter @Setter private ArrayList<Sendero> senderos;
	@Getter @Setter private ArrayList<Comodidades> comodidades;
	@Getter @Setter private ArrayList<Accesibilidad> accesibilidades;
	@Getter @Setter private ArrayList<Atractivo> atractivos;
	@Getter @Setter private ArrayList<Idiomas> idiomas;
	@Getter @Setter private ArrayList<Imagen> imagenes;
	@Getter @Setter private ArrayList<Contacto> contactos;
	@Getter @Setter private ArrayList<Video> videos;
	@Getter @Setter private ArrayList<Animacion3D> animaciones3d;
	@Getter @Setter private ArrayList<Comentario> comentarios;
	
}
