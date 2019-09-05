package ec.com.sai.model;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Imagen {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String autor;
	@Getter @Setter private Usuario usuarioIngresa;
	@Getter @Setter private String coordenadas;
	@Getter @Setter private Date fecha;
	@Getter @Setter private Boolean isReportado;
	@Getter @Setter private String url;
	@Getter @Setter private Boolean isPrincipal;
	@Getter @Setter private ArrayList<Etiquetas> etiquetas;
	@Getter @Setter private Ranking ranking;

}
