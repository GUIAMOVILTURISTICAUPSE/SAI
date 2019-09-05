package ec.com.sai.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Seguridad {
	//*** En este caso creo que falta agregar una lista de usuarios los cuales han dado like o dislike para que al momento de validar el voto no haya ningun problema.
	//*** De no existir la lista de usuarios un usuario puede votar y votar cuantas veces se le de la gana.
	@Getter @Setter private String codigo;
	@Getter @Setter private String descripcion;
	@Getter @Setter private long votosBaja;
	@Getter @Setter private long votosMedia;
	@Getter @Setter private long votosAlta;
	@Getter @Setter private long votosMuyAlta;
//	@Getter @Setter private ArrayList<String> usuariosIds;  //*** Para validar.

}
