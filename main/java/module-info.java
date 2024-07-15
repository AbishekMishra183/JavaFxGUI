module cos.mos.socket.server {
    requires javafx.controls;
    requires javafx.fxml;


    opens cos.mos.socket.server to javafx.fxml;
    exports cos.mos.socket.server;
}