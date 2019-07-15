package ec.com.sai.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import ec.com.sai.utilities.General;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Base {

    @FXML private ImageView img_logoIzq;
    @FXML private ImageView img_logoDer;
    @FXML private JFXDrawer drw_drawer;
    @FXML private JFXHamburger hmb_menu;
    @FXML private Label lbl_nombreUsuario;
    @FXML private Label lbl_empresa;
    @FXML private JFXButton btn_salir;
    public AnchorPane getAnch_Contenido() {
		return anch_Contenido;
	}

	public void setAnch_Contenido(AnchorPane anch_Contenido) {
		this.anch_Contenido = anch_Contenido;
	}

	@FXML public AnchorPane anch_Contenido;
    
    static String nombreEmpresa = "prefectura de santa elena";
    static String nombreUsuario = "Don Teo";    

	public void initialize() {
		General.setImageView("Upse.png", img_logoIzq);
		General.setImageView("Upse.png", img_logoDer);
		General.setTexttoLabel(lbl_empresa, nombreEmpresa);
		General.setTexttoLabel(lbl_nombreUsuario, nombreUsuario);
		General.setContentToJFXDrawer("/viewBase/BaseMenu.fxml", drw_drawer);
		General.setContentParent("/viewPrincipal/RecursoPrincipal.fxml", anch_Contenido);			
		
//		hmb_menu.setVisible(false);

		HamburgerBackArrowBasicTransition hmb1 = new HamburgerBackArrowBasicTransition(hmb_menu);
		hmb1.setRate(-1);		
		hmb_menu.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->{
			hmb1.setRate(hmb1.getRate() * - 1);
			hmb1.play();
			General.setAbriCerrarDRW(drw_drawer);
		});

	}
	
	@FXML
	void salir_CerrarCesion(ActionEvent event) {

	}
}
