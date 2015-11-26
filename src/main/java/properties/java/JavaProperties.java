package properties.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JavaProperties {
  private static final JavaProperties JPROP_INSTANCE = new JavaProperties();
  private static final String PATH = "javaproperties.properties";
  private static String ENV = "";
  private static final String SEPARATOR = ".";

  private static Properties properties = new Properties();

  private JavaProperties() {
  }

  public static JavaProperties getInstance() {
    load();
    ENV = System.getProperty("env", "test");
    return JPROP_INSTANCE;
  }

  public static void load() {
    InputStream inputStream = JavaProperties.class.getResourceAsStream(PATH);
    try {
      properties.load(inputStream);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getProperty(final String key) {
    String property = ENV + SEPARATOR + key;
    return properties.getProperty(property);
  }
}
