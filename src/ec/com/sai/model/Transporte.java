package ec.com.sai.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Transporte {
	@Getter @Setter private long id;
	@Getter @Setter private String descripcion;
	@Getter @Setter private Float distanciaAproximada;
	@Getter @Setter private Float tiempoRecorrido; //*** Deberia manejarse por horas. ejemplo: 13h00.
	@Getter @Setter private String estado;
	@Getter @Setter private TipoTransporte tipoTransporte;
	
}
