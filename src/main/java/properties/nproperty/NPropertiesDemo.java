package properties.nproperty;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Anhelina_Khalii on 26.11.2015.
 */
public class NPropertiesDemo {

  public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IOException, IllegalAccessException {
    NProperties properties = new NProperties();
    System.out.println("Url - " + properties.getURL() + ", user login - " + properties.getLOGIN() + ", password - " + properties.getPASSWORD());
  }

}
