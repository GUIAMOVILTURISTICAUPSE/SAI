package ec.com.sai.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import ec.com.sai.utilities.General;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class BusquedaRecurso{

    @FXML private JFXTextField txt_BuscarRecurso;

    @FXML private JFXButton btn_Buscar;
    
    @FXML private AnchorPane achp_ContenedorBusqueda;

	public void initialize() {
		General.setContentParent("/viewBusqueda/BusquedaContenido.fxml", achp_ContenedorBusqueda);
		
	}
    
    @FXML
    void buscarRecursoBTN(ActionEvent event) {
    	
    }

}
