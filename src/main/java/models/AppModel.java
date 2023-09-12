package models;

import javafx.beans.property.SimpleStringProperty;

public class AppModel {
    private SimpleStringProperty appName;
    private SimpleStringProperty appEmail;
    private SimpleStringProperty appIcon;

    public String getAppName() {
        return appName.get();
    }

    public AppModel(String appName, String appEmail, String appIcon) {
        this.appName = new SimpleStringProperty(appName);
        this.appEmail = new SimpleStringProperty(appEmail);
        this.appIcon = new SimpleStringProperty(appIcon);
    }

    public String getAppEmail() {
        return appEmail.get();
    }

    public String getAppIcon() {
        return appIcon.get();
    }
}
