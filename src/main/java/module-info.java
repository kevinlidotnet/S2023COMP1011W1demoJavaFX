module com.example.s2023comp1011w1demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.s2023comp1011w1demojavafx to javafx.fxml;
    exports com.example.s2023comp1011w1demojavafx;
}