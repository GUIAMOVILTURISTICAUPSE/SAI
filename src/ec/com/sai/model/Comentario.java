package ec.com.sai.model;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Comentario {
	@Getter @Setter private long id;
	@Getter @Setter private String descripcion;
	@Getter @Setter private Usuario autor;
	@Getter @Setter private Date fecha;
	@Getter @Setter private Boolean isReportado;
	@Getter @Setter private String estado;
	@Getter @Setter private ArrayList<Comentario> comentarios;
	@Getter @Setter private Ranking ranking;
	
}
