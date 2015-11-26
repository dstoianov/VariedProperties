package properties.yandex;

enum Envs {
  TEST("test"), DEV("dev");

  String text;

  Envs(String text){
    this.text = text;
  }

  @Override
  public String toString() {
    return this.text;
  }
}
