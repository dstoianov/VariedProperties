package properties.nproperty;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import jfork.nproperty.Cfg;
import jfork.nproperty.ConfigParser;


public class NProperties {

  @Cfg
  private static String URL;
  @Cfg
  private static String LOGIN;
  @Cfg
  private static int PASSWORD;

  public NProperties() throws NoSuchMethodException, InstantiationException, IllegalAccessException, IOException, InvocationTargetException {
    ConfigParser.parse(NProperties.class, "src/main/resources/config.ini");
  }

  public String getURL() {
    return URL;
  }

  public String getLOGIN() {
    return LOGIN;
  }

  public int getPASSWORD() {
    return PASSWORD;
  }
}
