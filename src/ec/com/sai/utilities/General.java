package ec.com.sai.utilities;

import java.io.IOException;

import com.gluonhq.maps.MapView;
import com.jfoenix.controls.JFXDrawer;

import ec.com.sai.main.IncursioLaunch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class General {

	/**
	 * Establece una imagen en un ImageView.
	 * @param nombreImagen 
	 * @param imgView
	 */
	public static void setImageView(String nombreImagen, ImageView imgView) {
		Image img = new Image(nombreImagen);
		imgView.setImage(img);
	}	
	
	/**
	 * Establece la interfaz de la URI como contenido del anchorPane.
	 * @param uri
	 * @param contenedor
	 */
	public static void setContentParent(String uri, AnchorPane contenedor){
		try{
			if(!contenedor.equals(null))contenedor.getChildren().removeAll();
			FXMLLoader loader = new FXMLLoader(IncursioLaunch.class.getResource(uri));
			AnchorPane page = (AnchorPane) loader.load();		
			AnchorPane.setBottomAnchor(page, 00.0);
			AnchorPane.setLeftAnchor(page, 00.0);
			AnchorPane.setTopAnchor(page, 00.0);
			AnchorPane.setRightAnchor(page, 00.0);
			contenedor.getChildren().setAll(page);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	/**
	 * Establece el mapa como contenido del anchorPane enviado.
	 * @param mapa
	 * @param contenedor
	 */
	public static void setMapatoAnchorPane(MapView map, AnchorPane contenedor){
		try{
			if(!contenedor.equals(null))contenedor.getChildren().removeAll();	
			AnchorPane.setBottomAnchor(map, 00.0);
			AnchorPane.setLeftAnchor(map, 00.0);
			AnchorPane.setTopAnchor(map, 00.0);
			AnchorPane.setRightAnchor(map, 00.0);
			contenedor.getChildren().setAll(map);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	/**
	 * Abre y cierra el JFXDrawer enviada como parametro. 
	 * @param drw
	 */
	public static void setAbriCerrarDRW(JFXDrawer drw) {
		if (drw.isOpened()) {
			drw.close();
		}else {
			drw.open();
		}
	}
	
	/**
	 * Establece el contenido en un JFXDrawer enviando por parametro la ruta 
	 * de la interfaz y el Drawer Contenedor.
	 * @param URI
	 * @param drw
	 */
	public static void setContentToJFXDrawer(String URI, JFXDrawer drw) {
		try {
			Parent v = FXMLLoader.load(IncursioLaunch.class.getResource(URI));
			drw.setSidePane(v);	
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	/**
	 * Establece el texto de un label.
	 * @param label
	 * @param text
	 */
	public static void setTexttoLabel(Label label, String text) {
		label.setText(text.toUpperCase());
	}
	
}
