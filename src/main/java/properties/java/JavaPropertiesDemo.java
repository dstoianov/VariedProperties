package properties.java;

public class JavaPropertiesDemo {

  public static void main(String[] args) {
    loadAndPrint("dev");
    loadAndPrint("test");
  }

  public static void loadAndPrint(String environment) {

    JavaProperties properties = JavaProperties.getInstance();

    String url = properties.getProperty("env.url");
    String userName = properties.getProperty("user.login");
    String password = properties.getProperty("user.pass");

    System.out.println("For " + environment + " environment: url - " + url + ", user login - " + userName + ", password - " + password);
  }
}
