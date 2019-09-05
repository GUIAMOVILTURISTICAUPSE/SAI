package ec.com.sai.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Rol {
	@Getter @Setter private long id;
	@Getter @Setter private String rol;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String estado;
	@Getter @Setter private ArrayList<Menu> menus;

}
