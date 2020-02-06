import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.Optional;

public class Controller {
    public static RadioButton rabCroissant;
    public static RadioButton rabDecroissant;
    public static CheckBox chbConfirmation;
    public static Button btnQuitter;
    public static Alert alert;

    public static void initialize() {
        ToggleGroup grA = new ToggleGroup();
        rabCroissant.setToggleGroup(grA);
        rabDecroissant.setToggleGroup(grA);

    }

    public void btnQuitterAction(ActionEvent actionEvent) {
        if (btnQuitter.isPressed() && chbConfirmation.isSelected()) {
                alert.setHeaderText(null);
                alert.setTitle("confirmation");
                alert.setContentText("Yes, No");
                alert.setAlertType(Alert.AlertType.CONFIRMATION);
                alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> result = alert.showAndWait();
        }
    }

    public void btnChoisirAction(ActionEvent actionEvent) {
    }

    public void btnTrierAction(ActionEvent actionEvent) {
    }

    public void btnTrouverAction(ActionEvent actionEvent) {
    }

    public void btnChercherAction(ActionEvent actionEvent) {
    }
}

