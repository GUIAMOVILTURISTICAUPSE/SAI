package ec.com.sai.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Video {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String autor;
	@Getter @Setter private Date fecha;
	@Getter @Setter private String url;
	@Getter @Setter private String estado;
	@Getter @Setter private Ranking ranking;	

}
