module com.miaad.tp_gui_miaad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.miaad.tp_gui_miaad to javafx.fxml;
    exports com.miaad.tp_gui_miaad;
}