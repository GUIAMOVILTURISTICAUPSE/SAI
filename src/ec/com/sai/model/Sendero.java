package ec.com.sai.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Sendero {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private Float distanciaAproximada;
	@Getter @Setter private Float tiempoRecorrido; //*** Deberia manejarse por horas. ejemplo: 13h00.
	@Getter @Setter private String instrucciones;
	@Getter @Setter private String estado;
	@Getter @Setter private DificultadRecorrido dificultad;
	@Getter @Setter private Seguridad seguridad;
	@Getter @Setter private DisponibilidadCelular senalCelular;
	@Getter @Setter private ArrayList<Costo> costos;
	@Getter @Setter private ArrayList<Recorrido> recorridoRuta;
	@Getter @Setter private ArrayList<Equipamiento> equipamiento;
	@Getter @Setter private ArrayList<Transporte> transportes;
	@Getter @Setter private ArrayList<Atractivo> atractivos;
	@Getter @Setter private ArrayList<Imagen> imagenes;
	@Getter @Setter private ArrayList<Video> videos;
	@Getter @Setter private ArrayList<Animacion3D> animaciones3d;
	@Getter @Setter private ArrayList<Comentario> comentarios;

}
