package properties.groovy;

import groovy.util.ConfigObject;
import groovy.util.ConfigSlurper;


import java.io.File;
import java.net.MalformedURLException;

public class GroovyProperties {
  private static GroovyProperties properties = new GroovyProperties();
  private static final String PATH = "src/main/resources/config.groovy";
  private static String ENV = "";
  private static ConfigObject config = new ConfigObject();
  private static final String SEPARATOR = ".";

  private GroovyProperties(){}

  public static GroovyProperties getInstance() {
    try
    {
      ENV = System.getProperty("env", "test");
      config = new ConfigSlurper(ENV).parse(new File(PATH).toURI().toURL());
      return properties;
    }
    catch(MalformedURLException e)
    {
      e.printStackTrace();
    }
    return null;
  }

  public String getProperty(final String key) {
    return config.toProperties().getProperty(key);
  }

}
