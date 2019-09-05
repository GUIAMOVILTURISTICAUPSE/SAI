package ec.com.sai.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Contacto {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String telefono;
	@Getter @Setter private String celular;
	@Getter @Setter private String correo;
	@Getter @Setter private String facebook;
	@Getter @Setter private String instagram;
	@Getter @Setter private String twitter;
	@Getter @Setter private String estado;

}
