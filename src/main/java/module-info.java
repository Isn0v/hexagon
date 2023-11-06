module com.github.isn0v {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.github.isn0v to javafx.fxml;
    exports com.github.isn0v;
}