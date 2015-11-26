package properties.yandex;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("javaproperties.properties")
public class YandexTestProperties implements IEnvironment {

  @Property("test.env.url")
  String url;

  @Property("test.user.login")
  String login;

  @Property("test.user.pass")
  int password;

  public String getUrl() {
    return url;
  }

  public String getLogin() {
    return login;
  }

  public int getPassword() {
    return password;
  }

  YandexTestProperties(){
    PropertyLoader.populate(this);
  }
}

