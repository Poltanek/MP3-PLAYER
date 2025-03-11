module main.mp3playerproject {
    requires javafx.controls;
    requires javafx.fxml;


    requires org.controlsfx.controls;

    opens main.mp3playerproject to javafx.fxml;
    exports main.mp3playerproject;
}