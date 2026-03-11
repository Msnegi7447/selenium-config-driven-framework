package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() {

        try {

            prop = new Properties();   // ⭐ VERY IMPORTANT

            String path = System.getProperty("user.dir") + "/resources/config.properties";

            FileInputStream fis = new FileInputStream(path);

            prop.load(fis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrowserName() {
        return prop.getProperty("browser");
    }

    public String geturldetails() {
        return prop.getProperty("url");
    }

    public String getUsername() {
        return prop.getProperty("username");
    }

    public String getPassword() {
        return prop.getProperty("password");
    }
}