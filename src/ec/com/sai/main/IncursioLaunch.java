package ec.com.sai.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IncursioLaunch extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			 Parent root = FXMLLoader.load(getClass().getResource("/viewBase/Base.fxml"));
			 Scene scene = new Scene(root);
			 primaryStage.setScene(scene);
			 primaryStage.setMaximized(true);
			 primaryStage.setMinWidth(500);
			 primaryStage.setMinHeight(500);
			 primaryStage.show();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
