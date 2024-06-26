package application;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.sun.glass.ui.View;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


public class PlayerController {
	@FXML private Label label_anime;
	@FXML private Label label_season;
	@FXML private Button button_prev;
	@FXML private Button button_next;
	@FXML private Button button_jumpToAnime;
	@FXML private Button button_jumpToSeason;
	@FXML private ChoiceBox<?> choiceBox_episord;
	@FXML private MediaView mediaView;
	
	Path path = Paths.get("a.mp4");
	Media media = new Media(path.toUri().toString());
	MediaPlayer player = new MediaPlayer(media);
	MediaView view = new MediaView();
	view.setMediaPlayer(player);
}
