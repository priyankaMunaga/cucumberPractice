package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Stream;

public class ConfigManager {

    public static Properties getResourceProperties(String... resourceNames) {
        return Stream.of(resourceNames)
                .map(r -> loadProperties(r))
                .collect(Properties::new, Map::putAll, Map::putAll);
    }

    private static Properties loadProperties(String resourceName) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = ConfigManager.class.getClassLoader().getResourceAsStream(resourceName);
            if (inputStream == null) {
            } else {
                properties.load(inputStream);
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("Problem loading property resource: %s", resourceName), e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return properties;
    }

}
