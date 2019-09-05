package ec.com.sai.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Atractivo {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String coordenadas;
	@Getter @Setter private String estado;
	@Getter @Setter private ArrayList<TipoAtractivo> tipoAtractivos;
	@Getter @Setter private ArrayList<Imagen> imagenes;
	
}
