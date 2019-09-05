package ec.com.sai.model;

import javafx.scene.web.HTMLEditor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Animacion3D {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String autor;
	@Getter @Setter private HTMLEditor animacion; //*** No se realmente si es lo que Carmen necesita.
	@Getter @Setter private String url;
	@Getter @Setter private String estado;
	@Getter @Setter private Ranking ranking;
	
}
