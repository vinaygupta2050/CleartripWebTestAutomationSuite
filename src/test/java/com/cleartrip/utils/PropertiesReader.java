package com.cleartrip.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author in-vinaykumar.gupta on 19/03/22
 * @project IntelliJ IDEA
 */
public class PropertiesReader {
    Properties properties = new Properties();
    public PropertiesReader() {
        loadProperties();
    }
    private void loadProperties() {
        try {
            String env = System.getProperty("env");
            System.out.println("ENV: " + env);
            if (null == env) env = "STAGING";
            String propertiesFilePath = env + ".properties";
            InputStream inputStream = this
                    .getClass()
                    .getClassLoader()
                    .getResourceAsStream(propertiesFilePath);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String readProperty(String key) {
        return properties.getProperty(key);
    }
    public String getAppUrl() {
        return readProperty("appUrl");
    }
    //This method takes care to read credentials if there is any
    public String getUserName() {
        return readProperty("userName");
    }
    public String getPassword() {
        return readProperty("password");
    }
}
