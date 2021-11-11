package GraphicInt;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import java.text.DecimalFormat;
import java.time.LocalTime;

public class GraphicInt extends Application {
    private static final String PANEL_STYLE = "-fx-border-radius: 8px;" +
            "-fx-border-width: 3px;" +
            "-fx-border-color: #ffffff;" +
            "-fx-font-family: SimSun;";

    private static final String PANEL_HEADER_STYLE = "-fx-background-color: #b0bdd4;" +
            "-fx-padding: 5px;" +
            "-fx-font-weight: bold;" +
            "-fx-font-family: SimSun;";

    private DecimalFormat temperatureFormat = new DecimalFormat("##.0");

    private Label timerLabel;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane rootpane = new Pane();

        VBox container = new VBox();
        container.setPrefWidth(900);
        container.setPrefHeight(576);
        // change background color to #b0bdd4
        container.setStyle("-fx-background-color: #b0bdd4");
        rootpane.getChildren().add(container);

        /* * ROW 1 */ 
        HBox row1HBox = new HBox();
        row1HBox.setPrefWidth(1280);
        row1HBox.setPrefHeight(240);
        row1HBox.setMaxHeight(240);

        // Day Time Clock
        HBox dayTimeClockHBox = new HBox();

        // styling
        dayTimeClockHBox.setPrefWidth(280);
        HBox.setMargin(dayTimeClockHBox, new Insets(20));
        dayTimeClockHBox.setStyle(PANEL_STYLE);
        dayTimeClockHBox.setAlignment(Pos.CENTER);

        // label heading
        Label dayTimeClockLabel = new Label("Clock");
        dayTimeClockLabel.setLayoutX(30);
        dayTimeClockLabel.setLayoutY(7);
        dayTimeClockLabel.setStyle(PANEL_HEADER_STYLE);
        dayTimeClockLabel.setTextFill(Color.web("#ffffff"));
        dayTimeClockLabel.setLineSpacing(8);
        rootpane.getChildren().add(dayTimeClockLabel);

        // content
        Label timeLabel = new Label("hh : mm : ss");
        timeLabel.setTextFill(Color.web("BLACK"));
        timeLabel.setFont(new Font(50));
        
        timerLabel = new Label("00 : 00 : 00");
        timerLabel.setTextFill(Color.web("BLACK"));
        timerLabel.setFont(new Font(50));
        timerLabel.setStyle("-fx-font-family: SimSun");
        dayTimeClockHBox.getChildren().add(timeLabel);

        /*
         * Elapsed Time
         */
        HBox elapsedTimeHBox = new HBox();

        // styling
        elapsedTimeHBox.setPrefWidth(550);
        HBox.setMargin(elapsedTimeHBox, new Insets(20));
        elapsedTimeHBox.setStyle(PANEL_STYLE);
        elapsedTimeHBox.setAlignment(Pos.CENTER);

        // label heading
        Label elapsedTimeLabel = new Label("Stopwatch");
        elapsedTimeLabel.setLayoutX(350);
        elapsedTimeLabel.setLayoutY(7);
        elapsedTimeLabel.setStyle(PANEL_HEADER_STYLE);
        elapsedTimeLabel.setTextFill(Color.web("#ffffff"));
        elapsedTimeLabel.setLineSpacing(8);
        rootpane.getChildren().add(elapsedTimeLabel);

        // content
        VBox timerButtonsVBox = new VBox(5);
        timerButtonsVBox.setAlignment(Pos.CENTER);
        timerButtonsVBox.setPadding(new Insets(0, 0, 0, 50));

        Button startTimer = new Button("START");
        Button stopTimer = new Button("STOP");
        Button resetTimer = new Button("RESET");
        
        String timerButtonStyle = "-fx-background-color: #9C9998;" +
                "-fx-border-width: 2px;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 3px;" +
                "-fx-background-radius: 5px;" +
                "-fx-text-fill: BLACK;" +
                "-fx-font-size: 20;" +
                "-fx-font-weight: bold;" +
                "-fx-background-insets: 1;" +
                "-fx-font-family: SimSun;";
        startTimer.setStyle(timerButtonStyle);
        stopTimer.setStyle(timerButtonStyle);
        resetTimer.setStyle(timerButtonStyle);

        startTimer.setPrefWidth(100);
        startTimer.setPrefHeight(40);
        stopTimer.setPrefWidth(100);
        stopTimer.setPrefHeight(40);
        resetTimer.setPrefWidth(100);
        resetTimer.setPrefHeight(40);

        timerButtonsVBox.getChildren().addAll(startTimer, stopTimer, resetTimer);
        elapsedTimeHBox.getChildren().addAll(timerLabel, timerButtonsVBox);
        row1HBox.getChildren().addAll(dayTimeClockHBox, elapsedTimeHBox);

        HBox row2HBox = new HBox();
        row2HBox.setPrefWidth(1280);
        row2HBox.setPrefHeight(240);
        row2HBox.setMaxHeight(240);
 
        HBox SelectorHBox = new HBox(10);

        // styling
        SelectorHBox.setPrefWidth(640);
        HBox.setMargin(SelectorHBox, new Insets(20));
        SelectorHBox.setStyle(PANEL_STYLE);
        SelectorHBox.setAlignment(Pos.CENTER);

        // label heading
        Label SelectorlLabel = new Label("SELECTOR");
        SelectorlLabel.setLayoutX(30);
        SelectorlLabel.setLayoutY(250);
        SelectorlLabel.setStyle(PANEL_HEADER_STYLE);
        SelectorlLabel.setTextFill(Color.web("#ffffff"));
        SelectorlLabel.setLineSpacing(10);
        rootpane.getChildren().add(SelectorlLabel);

        String squareStyle = "-fx-text-fill: #000000;";
        String headerStyle = "-fx-text-fill: #dea034;";

        // content
        
       
        Pane parapain= new HBox(15);
        Pane hyperpain= new HBox(15);
        Pane sinepain= new HBox(15);
        Pane cosinepain= new HBox(15);
        
        //Button back = new Button("Back");
        Image img = new Image("parabola.jpeg");
        Image img2 = new Image("hyperbola.jpeg");
        Image img3 = new Image("sine.jpeg");
        Image img4 = new Image("cosine.jpeg");
        
        parapain.getChildren().addAll(new ImageView(img));  
        hyperpain.getChildren().addAll(new ImageView(img2));  
        sinepain.getChildren().addAll(new ImageView(img3));  
        cosinepain.getChildren().addAll(new ImageView(img4));  
        //back removed from display due to incompatibility
        
        Scene scene1 = new Scene(parapain, 300, 300);
        Scene scene2 = new Scene(hyperpain, 300, 250);
        Scene scene3 = new Scene(sinepain, 600, 300);
        Scene scene4 = new Scene(cosinepain, 350, 170);
        
        
        Button parabola = new Button("PARABOLA");
        Button hyperbola = new Button("HYPERBOLA");
        Button sine = new Button("SINE");
        Button cosine = new Button("COSINE");
        String graphButtonStyle = "-fx-background-color: WHITE;" +
                "-fx-border-width: 2px;" +
                "-fx-border-color: #ffffff;" +
                "-fx-border-radius: 3px;" +
                "-fx-background-radius: 5px;" +
                "-fx-text-fill: BLACK;" +
                "-fx-font-size: 28;" +
                "-fx-font-weight: bold;" +
                "-fx-background-insets: 1;" +
                "-fx-font-family: SimSun;";
        parabola.setStyle(graphButtonStyle);
        hyperbola.setStyle(graphButtonStyle);
        sine.setStyle(graphButtonStyle);
        cosine.setStyle(graphButtonStyle);
 
        VBox SelVBox = new VBox(5);
        SelVBox.setAlignment(Pos.CENTER_LEFT);
        SelVBox.getChildren().addAll(parabola,hyperbola,sine,cosine); 
        SelectorHBox.getChildren().addAll(SelVBox);
        row2HBox.getChildren().addAll( SelectorHBox);
        container.getChildren().addAll(row1HBox, row2HBox);
        
       

        /*
         * Event Handling
         */

        // Day Time Clock
        updateCurrentTime(timeLabel);

        // Elapsed Time
        ElapsedTimer timer = new ElapsedTimer();
        startTimer.setOnAction(event -> timer.start());
        stopTimer.setOnAction(event -> timer.stop());
        resetTimer.setOnAction(event -> timer.reset());

       
        // add rootpane to scene and display stage
        Scene scene = new Scene(rootpane, 900, 576);
        primaryStage.setTitle("Graphical Interpertor");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // adding button functionality
        //back button not displaying
        /*back.setOnAction((event) -> {
        back.setText("Going to Main");
        parabola.setText("PARABOLA");
        hyperbola.setText("HYPERBOLA");
        sine.setText("SINE");
        cosine.setText("COSINE");
        primaryStage.setScene(scene1);
        primaryStage.show();
        }); */
        
        parabola.setOnAction((event) -> {        
        // improvising alternative to back button to get to main GUI 
        Stage s1= new Stage();
        s1.setTitle("Parabola");
        s1.setScene(scene1);
        s1.show();
        });
        
        hyperbola.setOnAction((event) -> {
        
        Stage s2= new Stage();
        s2.setTitle("Hyperbola");
        s2.setScene(scene2);
        s2.show();
        });
        sine.setOnAction((event) -> {
        
        Stage s3= new Stage();
        s3.setTitle("Sine");
        s3.setScene(scene3);
        s3.show();});
        
        cosine.setOnAction((event) -> {
        
        Stage s4= new Stage();
        s4.setTitle("Parabola");
        s4.setScene(scene4);
        s4.show();
        });
        

        
    }

    /**
     * Function to set the passed label to the current time.
     *
     * @param label label to set
     */
    private void updateCurrentTime(Label label) {
        // https://stackoverflow.com/questions/42383857/javafx-live-time-and-date/42384436
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();

            int hour = currentTime.getHour();
            int minute = currentTime.getMinute();
            int second = currentTime.getSecond();

            label.setText(String.format("%02d : %02d : %02d", hour, minute, second));
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    /**
     * Class to run a timer with hours, minutes and seconds.
     */
    private class ElapsedTimer extends AnimationTimer {
        // https://stackoverflow.com/questions/40821849/creating-simple-stopwatch-javafx
        private long timestamp;
        private long time = 0;
        private long fraction = 0;

        @Override
        public void start() {
            // current time adjusted by remaining time from last run
            timestamp = System.currentTimeMillis() - fraction;
            super.start();
        }

        @Override
        public void stop() {
            super.stop();
            // save leftover time
            fraction = System.currentTimeMillis() - timestamp;
        }

        public void reset() {
            // this.stop(); // uncomment this to stop timer on reset
            time = 0;
            fraction = 0;
            timerLabel.setText("00 : 00 : 00");
        }

        @Override
        public void handle(long now) {
            long newTime = System.currentTimeMillis();

            // update every second
            if (timestamp + 1000 <= newTime) {
                // calculate difference in time from last update to current time
                long deltaT = (newTime - timestamp) / 1000;

                // add difference to time
                time += deltaT;

                // update timestamp in case of stop
                timestamp += 1000 * deltaT;

                // calculate hours, minutes and seconds
                int input = (int) time;
                int hours = (input % 86400) / 3600;
                int minutes = ((input % 86400) % 3600) / 60;
                int seconds = ((input % 86400) % 3600) % 60;

                timerLabel.setText(String.format("%02d : %02d : %02d", hours, minutes, seconds));
            }
        }
    }

}