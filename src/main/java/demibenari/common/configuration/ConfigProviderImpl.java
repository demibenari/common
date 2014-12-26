package demibenari.common.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *
 * Created by Demi Ben-Ari on 12/13/2014.
 */
public class ConfigProviderImpl implements ConfigProvider {
    Map<String,String> configMap;

    public ConfigProviderImpl() {
        configMap = new HashMap<>();

        Properties properties = System.getProperties();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();

        for (Map.Entry<Object, Object> propertyEntry : entries) {
            configMap.put(propertyEntry.getKey().toString(), propertyEntry.getValue().toString());
        }
    }

    @Override
    public String getProperty(String propertyName) {
        if (configMap != null ) {
            return configMap.get(propertyName);
        } else {
            return null;
        }
    }

    @Override
    public void injectConfiguration(Map<String, String> propertiesMap) {
        configMap = propertiesMap;
    }
}
