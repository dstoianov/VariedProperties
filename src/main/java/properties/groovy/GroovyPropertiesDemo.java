package properties.groovy;

import java.net.MalformedURLException;

public class GroovyPropertiesDemo {

  public static void main(String[] args) throws MalformedURLException {
    loadAndPrint("dev");
    loadAndPrint("test");
  }

  public static void loadAndPrint(String environment) {
    System.setProperty("env", environment);

    GroovyProperties properties = GroovyProperties.getInstance();

    String url = properties.getProperty("url");
    String userName = properties.getProperty("login");
    String password = properties.getProperty("pass");

    System.out.println("For " + environment + " environment: url - " + url + ", user login - " + userName + ", password - " + password);
  }

}
