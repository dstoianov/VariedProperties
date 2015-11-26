package properties.yandex;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("javaproperties.properties")
public class YandexDevProperties implements IEnvironment {
  @Property("dev.env.url")
  private String url;

  @Property("dev.user.login")
  private String login;

  @Property("dev.user.pass")
  private int password;

  public String getUrl() {
    return url;
  }

  public String getLogin() {
    return login;
  }

  public int getPassword() {
    return password;
  }

  YandexDevProperties(){
    PropertyLoader.populate(this);
  }
}
