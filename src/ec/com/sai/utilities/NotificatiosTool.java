package ec.com.sai.utilities;

import org.controlsfx.control.Notifications;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.util.Duration;

public class NotificatiosTool {

	
	public static void showNotificationPush() {
		Notifications notificacion = Notifications.create()
				.title("")
				.text("")
				.graphic(null)
				.hideAfter(Duration.seconds(5))
				.position(Pos.BOTTOM_RIGHT)
				.onAction(new javafx.event.EventHandler<ActionEvent>() {					
					@Override
					public void handle(ActionEvent event) {
						
					}
				});
		notificacion.showConfirm();
	}
	
}
