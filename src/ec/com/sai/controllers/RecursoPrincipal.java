package ec.com.sai.controllers;

import com.gluonhq.maps.MapPoint;
import com.gluonhq.maps.MapView;
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
		
		MapView map = new MapView();
//		anch_mapa.getChildren().removeAll();
//		anch_mapa.getChildren().add(map);
		
		try{
			if(!anch_mapa.equals(null))anch_mapa.getChildren().removeAll();
			AnchorPane.setBottomAnchor(map, 00.0);
			AnchorPane.setLeftAnchor(map, 00.0);
			AnchorPane.setTopAnchor(map, 00.0);
			AnchorPane.setRightAnchor(map, 00.0);
			anch_mapa.getChildren().setAll(map);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		MapPoint mapPoint = new MapPoint(-2.403112, -80.680321);
//		Node icon = new Circle(5, Color.RED);
		
		
//		Node icon = new Circle(5, Color.BLUE);
//		Point2D mapPoint = baseMap.getMapPoint(point.getLatitude(), point.getLongitude());
//		icon.setTranslateX(mapPoint.getX());
//		icon.setTranslateY(mapPoint.getY());
		
//		MapLayer layer = new MapLayer();			
//        map.addLayer(layer);
        map.setCenter(mapPoint);
        map.setZoom(30);
        map.flyTo(1., mapPoint, 2.);
        
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
//    	NotificationsTool.showNotificationPush();
    	
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
