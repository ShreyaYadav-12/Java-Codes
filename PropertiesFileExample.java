package oops;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class PropertiesFileExample {

		    public static void main(String[] args) throws IOException{
		        Properties props= new Properties();

		        props.setProperty("db.user", "Laxmi");
		        props.setProperty("db.password", "secret");

		        //save to a file

		        FileOutputStream fos= new FileOutputStream("config.properties");
		        props.store(fos, "Database config");
		        System.out.println("info has been stored");
		        fos.close();
		        
		        Properties loadprops = new Properties();
		        
		        FileOutputStream fis= new FileOutputStream("config.properties");
//		        loadprops.load(fis);
		        System.out.println("file has been loaded");
		        fis.close();
		    }
		}