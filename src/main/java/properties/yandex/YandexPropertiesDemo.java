package properties.yandex;

public class YandexPropertiesDemo {

  public static void main(String[] args) {
    loadAndPrint(Envs.DEV);
    loadAndPrint(Envs.TEST);
  }

  public static void loadAndPrint(final Envs env){
    IEnvironment environment;
    environment = new YandexDevProperties();

    switch (env){
      case TEST:
        environment = new YandexTestProperties();
        break;
      case DEV:
        environment = new YandexDevProperties();
        break;
    }

    String url = environment.getUrl();
    String userName = environment.getLogin();
    int password = environment.getPassword();

    System.out.println("For "+env.toString()+" environment: url - " + url + ", user login - " + userName + ", password - " + password);
  }
}

