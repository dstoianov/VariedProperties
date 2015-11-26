package properties.apache;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ApacheProperties {

  private static ApacheProperties properties = new ApacheProperties();
  private static Configuration config = new PropertiesConfiguration();
  private static final String PATH = "javaproperties.properties";
  private static String ENV = "";
  private static final String SEPARATOR = ".";

  private ApacheProperties(){}

  public static ApacheProperties getInstance() {
    try
    {
      ENV = System.getProperty("env", "test");
      config = new PropertiesConfiguration(PATH);
      return properties;
    }
    catch(ConfigurationException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  public String getStringProperty(final String key) {
    String property = ENV + SEPARATOR + key;
    return config.getString(property);
  }

  public int getIntegerProperty(final String key) {
    String property = ENV + SEPARATOR + key;
    return config.getInt(property);
  }

}
