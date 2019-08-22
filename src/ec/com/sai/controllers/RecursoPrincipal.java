package ec.com.sai.controllers;

import com.jfoenix.controls.JFXButton;

import ec.com.sai.utilities.Context;
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
    @FXML private HBox hbx_busqueda;
    @FXML private HBox hbx_contenedorInfBasica;
    @FXML private AnchorPane anch_busqueda;
    @FXML private AnchorPane anch_mapa;
    @FXML private AnchorPane anch_contenedor;
    @FXML private AnchorPane anch_rp;

	public void initialize() {	
		General.setContentParent("/viewPrincipal/RecursoInformacionBasica.fxml", anch_contenedor);
		General.setContentParent("/viewBusqueda/BusquedaRecurso.fxml", anch_busqueda);
	}        

    @FXML
    void crearRecurso(ActionEvent event) {
    	Context.getInstance().setAnch_Contenido(anch_rp);    	
    	General.setContentParent("/viewRecurso/Recurso.fxml", (AnchorPane) anch_rp.getParent());
    }

    @FXML
    void eliminarRecurso(ActionEvent event) {

    }

    @FXML
    void modificarRecurso(ActionEvent event) {
    	
    }

    @FXML
    void showBusqueda(ActionEvent event) {
    	if (hbx_busqueda.isVisible()) {
			hbx_busqueda.setVisible(false);
		}else {
			hbx_busqueda.setVisible(true);
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
    	Context.getInstance().setAnch_Contenido(anch_rp); 
    	General.setContentParent("/viewRecurso/Recurso.fxml", (AnchorPane) anch_rp.getParent());
    }
	
}
