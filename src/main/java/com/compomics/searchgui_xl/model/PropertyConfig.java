package com.compomics.searchgui_xl.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Genet
 */
public class PropertyConfig {

    private final Properties properties = new Properties();
    private String path;

    /**
     * private constructor to prevent multiple instantiation
     */
    private PropertyConfig() {
        InputStream is=null;
        try {
            
            path = getFullPath("ConfigFile.properties");
            is = new FileInputStream(path);
            properties.load(is);
            
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }finally{
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PropertyConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Local singleton object instantiation
     */
    private static class Config {

        private static final PropertyConfig INSTANCE = new PropertyConfig();
    }

    /**
     * singleton instance of the class
     *
     * @return object of this class
     */
    public static PropertyConfig getInstance() {
        return Config.INSTANCE;
    }

    /**
     * gets the the corresponding property value for the given key
     *
     * @param key, the key of the value to be returned
     * @return corresponding value of the key
     */
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    
//    /**
//     * returns all the property names in the property file
//     * @return 
//     */
//    public Set<String> getAllProperties(){
//        return properties.stringPropertyNames();
//    }

    /**
     * update the properties file value if it is found in the record
     *
     * @param key
     * @param value
     */
    public void setProperty(String key, String value) {
        if (keyfound(key)) {
            properties.setProperty(key, value);
        } else {
            System.out.println("There is no properties with key value of " + key);
        }

    }

    /**
     * save properties on the file
     */
    public void saveProperties() {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path);
            properties.store(out, null);

        } catch (Exception ex) {
            Logger.getLogger(PropertyConfig.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(PropertyConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * check if the given key is available
     *
     * @param key, the key to search in the property file
     * @return true if key is present else return false
     */
    public boolean keyfound(String key) {
        return properties.containsKey(key);
    }

    /**
     * search for the file in resource folder and project class path
     *
     * @param fileName, file the search
     * @return the full path of the file
     */
    private String getFullPath(String fileName) {
        Resource r = new FileSystemResource("resources" + File.separator + fileName);
        path = null;
        if (!r.exists()) {
            //try to find it on the classpath
            r = new ClassPathResource(fileName);
            if (!r.exists()) {
                // making sure to run on Netbeans..
                r = new FileSystemResource("src" + File.separator + "main" + File.separator + "resources" + File.separator + fileName);
                if (!r.exists()) {
                    r = null;
                }
            }
        }
        if (r != null) {
            try {
                path = r.getFile().getAbsolutePath();
            } catch (IOException ex) {
                Logger.getLogger(PropertyConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return path;
    }

}
