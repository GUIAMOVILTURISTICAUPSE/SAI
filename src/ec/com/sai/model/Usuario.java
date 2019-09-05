package ec.com.sai.model;

import java.util.ArrayList;

import javafx.scene.image.Image;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Usuario {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String apellidos;
	@Getter @Setter private String usuario;
	@Getter @Setter private String contraseña;
	@Getter @Setter private String telefono;
	@Getter @Setter private String celular;
	@Getter @Setter private String correo;
	@Getter @Setter private String facebook;
	@Getter @Setter private String instagram;
	@Getter @Setter private String twitter;
	@Getter @Setter private Image foto;
	@Getter @Setter private String estado;
	@Getter @Setter private ArrayList<Rol> roles;

}
