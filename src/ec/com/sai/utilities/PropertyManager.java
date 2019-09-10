package ec.com.sai.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import ec.com.sai.model.Recurso;
import ec.com.sai.model.Sendero;
import lombok.Getter;
import lombok.Setter;

public class PropertyManager {
    @Getter @Setter private String serverHostname;    
    @Getter @Setter private String serverPort;    
    @Getter @Setter private String servicesIndexPath;    
    @Getter @Setter public static String baseURL;	
    @Getter @Setter private String recursosPath;
    @Getter @Setter private String senderosPath;
	
	public Map<String, String> mapClaseURLRelativo;
	
	public PropertyManager() {
		String resourceName = "application.properties";
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties config = new Properties();
		InputStream resourceStream = loader.getResourceAsStream(resourceName);
	    try {
			config.load(resourceStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		serverHostname = config.getProperty("server.hostname");
		serverPort = config.getProperty("server.port");
		servicesIndexPath = config.getProperty("services.index.path");
		recursosPath = config.getProperty("recursos.path");
		senderosPath = config.getProperty("senderos.path");
		baseURL = "http://"+serverHostname+":"+serverPort+"/"+servicesIndexPath;
		mapearClasesAPropiedadURLRelativo();
	}

	private void mapearClasesAPropiedadURLRelativo(){
		mapClaseURLRelativo = new HashMap<String, String>();
		mapClaseURLRelativo.put(Recurso.class.getName(), recursosPath);
		mapClaseURLRelativo.put(Sendero.class.getName(), senderosPath);
	}

	public static String getURLBase(){
		if(PropertyManager.baseURL.equals(null) || PropertyManager.baseURL.equals(""))
		{
			PropertyManager pm = new PropertyManager();
		}
		
		return PropertyManager.baseURL;
	}
	
}
