package properties.apache;

public class ApachePropertiesDemo {
  public static void main(String[] args) {
    loadAndPrint("dev");
    loadAndPrint("test");
  }

  public static void loadAndPrint(String environment){
    System.setProperty("env", environment);

    ApacheProperties properties = ApacheProperties.getInstance();

    String url = properties.getStringProperty("env.url");
    String userName = properties.getStringProperty("user.login");
    int password = properties.getIntegerProperty("user.pass");

    System.out.println("For "+environment+" environment: url - " + url + ", user login - " + userName + ", password - " + password);
  }
}
