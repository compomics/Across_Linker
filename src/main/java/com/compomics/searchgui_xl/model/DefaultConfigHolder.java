
package com.compomics.searchgui_xl.model;

import java.io.IOException;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;
import org.springframework.core.io.Resource;
/**
 *
 * @author Genet
 */
public class DefaultConfigHolder extends PropertiesConfiguration {
    
    
     /**
     * Logger instance.
     */
    private static final Logger LOGGER = Logger.getLogger(ConfigHolder.class);
    /**
     * ConfigHolder singleton instance.
     */
    private static DefaultConfigHolder ourInstance;

    static {
        try {
           
            Resource propertiesResource = ResourceUtils.getResourceByRelativePath("DefaultConfigFile.properties");
            ourInstance = new DefaultConfigHolder(propertiesResource);
        } catch (IOException | ConfigurationException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    /**
     * Private constructor to prevent instantiation.
     *
     * @param propertiesResource the properties resource
     * @throws ConfigurationException in case of a configuration initialization
     * problem
     * @throws IOException in case of an I/O related problem
     */
    private DefaultConfigHolder(Resource propertiesResource) throws ConfigurationException, IOException {
        super(propertiesResource.getURL());
    }

    /**
     * Gets the PropertiesConfiguration instance
     *
     * @return the PropertiesConfigurationHolder instance
     */
    public static DefaultConfigHolder getInstance() {
        return ourInstance;
    }
           
}
