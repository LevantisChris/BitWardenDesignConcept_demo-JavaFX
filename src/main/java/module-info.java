module com.example.bitwardendesignconcept_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bitwardendesignconcept_demo to javafx.fxml;
    exports com.example.bitwardendesignconcept_demo;
}