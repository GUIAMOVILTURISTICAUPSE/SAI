package ec.com.sai.controllers;

import com.jfoenix.controls.JFXButton;

import ec.com.sai.utilities.General;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class RecursoPrincipal {

    @FXML private JFXButton btn_busqueda;
    @FXML private JFXButton btn_crear;
    @FXML private JFXButton btn_modificar;
    @FXML private JFXButton btn_eliminar;
    @FXML private JFXButton btn_masInformacion;
    @FXML private JFXButton btn_abrirInfBasica;
    @FXML private HBox hbx_Busqueda;
    @FXML private HBox hbx_contenedorInfBasica;
    @FXML private AnchorPane achp_Busqueda;
    @FXML private AnchorPane achp_mapa;
    @FXML private AnchorPane achp_contenedor;
    @FXML private AnchorPane achp_rp;


	public void initialize() {	
		General.setContentParent("/viewPrincipal/RecursoInformacionBasica.fxml", achp_contenedor);
		General.setContentParent("/viewBusqueda/BusquedaRecurso.fxml", achp_Busqueda);
	}        

    @FXML
    void crearRecurso(ActionEvent event) {
    	
//    	General.setContentParent("/viewRecurso/Recurso.fxml", (AnchorPane) achp_rp.getParent());
    }

    @FXML
    void eliminarRecurso(ActionEvent event) {

    }

    @FXML
    void modificarRecurso(ActionEvent event) {

    }

    @FXML
    void showBusqueda(ActionEvent event) {
    	if (hbx_Busqueda.isVisible()) {
			hbx_Busqueda.setVisible(false);
		}else {
			hbx_Busqueda.setVisible(true);
		}	    	
    }

    @FXML
    void showInformacionBasica(ActionEvent event) {
    	if (hbx_contenedorInfBasica.isVisible()) {
			hbx_contenedorInfBasica.setVisible(false);
		}else {
			hbx_contenedorInfBasica.setVisible(true);
		}	    	
    }

    @FXML
    void showMasInformacion(ActionEvent event) {

    }
	
}
