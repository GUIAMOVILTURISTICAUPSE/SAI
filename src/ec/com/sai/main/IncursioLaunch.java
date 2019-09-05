package ec.com.sai.main;

import javafx.application.Application;
import javafx.collections.ObservableMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class IncursioLaunch extends Application{
	private Stage mStage;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			mStage = primaryStage;
			 Parent root = FXMLLoader.load(getClass().getResource("/viewBase/Base.fxml"));
			 Scene scene = new Scene(root);
			 primaryStage.setScene(scene);
			 primaryStage.setMaximized(true);
			 primaryStage.setMinWidth(500);
			 primaryStage.setMinHeight(500);
			 initAccelerators();
			 primaryStage.show();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

    private void initAccelerators() {
        final ObservableMap<KeyCombination, Runnable> accelerators = mStage.getScene().getAccelerators();

        accelerators.put(new KeyCodeCombination(KeyCode.Q, KeyCombination.SHORTCUT_DOWN), (Runnable) () -> {
            mStage.fireEvent(new WindowEvent(mStage, WindowEvent.WINDOW_CLOSE_REQUEST));
        });

        accelerators.put(new KeyCodeCombination(KeyCode.ESCAPE), (Runnable) () -> {
            mStage.fireEvent(new WindowEvent(mStage, WindowEvent.WINDOW_CLOSE_REQUEST));
        });
    }
	
}
