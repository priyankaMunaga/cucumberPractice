package org.example;

import java.io.IOException;
import java.util.Map;
import java.io.InputStream;
import java.util.Properties;
import java.util.stream.Stream;

public class ConfigManager {
    private static final Properties properties = loadProperties("Config.properties");

    private static Properties loadProperties(String resourceName) {
        Properties properties = new Properties();
        try (InputStream inputStream = ConfigManager.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (inputStream != null) {
                properties.load(inputStream);
            }
        } catch (IOException e) {
            throw new RuntimeException("Problem loading property resource: " + resourceName, e);
        }
        return properties;
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
