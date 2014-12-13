package demibenari.common.configuration;

import java.util.Map;

/**
 * Created by Demi on 12/13/2014.
 */
public interface ConfigProvider {
    public String getProperty(String propertyName);
    public String injectConfiguration(Map<String, String> propertiesMap);
}
