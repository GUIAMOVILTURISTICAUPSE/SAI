package ec.com.sai.model;

import javafx.scene.image.Image;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Leonardo Tomalo.
 **/

public class Menu {
	@Getter @Setter private long id;
	@Getter @Setter private String nombre;
	@Getter @Setter private String url;
	@Getter @Setter private Image logo;
	@Getter @Setter private Integer orden;
	@Getter @Setter private String estado;
	@Getter @Setter private Menu padre;

}
