/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class PropertiesFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties properties = new Properties();
        OutputStream outputStream = null;
        InputStream inputStream = null;
        writeToPropsFile(properties,outputStream);
        loadPropsFile(properties,inputStream);
        printEveryThing(properties,inputStream);
        
    }
    
    public static void writeToPropsFile(Properties props, OutputStream outStream){
        try {
            outStream = new FileOutputStream("config.properties");
            props.setProperty("port","8983");
            props.setProperty("user","admin");
            props.setProperty("pass","admin");
            props.store(outStream,null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PropertiesFile.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            if(outStream != null) {
                try {
                    outStream.close();
                }
                catch (Exception e) {
                    System.out.println(e.getCause());
                }
            }
        }
    }
    
    public static void loadPropsFile(Properties props, InputStream inStream) {
        try {
            inStream = new FileInputStream("config.properties");
            
            System.out.println("================loadPropsFile==============");
            props.load(inStream);
            System.out.println(props.get("port"));
            System.out.println(props.get("user"));
            System.out.println(props.get("pass"));

        } 
        catch (Exception e) {
            System.out.println(e.getCause());
        }
        finally {
            if(inStream != null) {
                try {
                    inStream.close();
                } 
                catch (IOException ex) {
                    System.out.println(ex.getCause());
                }
            }
        }
    }

    public static void printEveryThing(Properties props, InputStream inStream) {
        try {
            inStream = new FileInputStream("config.properties");
            props.load(inStream);
            Enumeration<?> e = props.propertyNames();
            System.out.println("================printEveryThing==============");
            while(e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = props.getProperty(key);
                System.out.println("KEY: " + key + " - " + "VALUE: "+value);
            }
        } 
        catch (IOException ex) {
            System.out.println(ex.getCause());
        }
    }
  
}
