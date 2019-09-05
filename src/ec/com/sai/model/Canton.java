package ec.com.sai.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Canton {
	@Getter @Setter private String codigo;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String codProvincia;
	@Getter @Setter private ArrayList<Parroquia> parroquias;
	
}
