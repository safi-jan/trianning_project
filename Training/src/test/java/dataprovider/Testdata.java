package dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Testdata {
  @Test(dataProvider = "singin")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] singin() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] {3,"c"},
      
    };
  }
}
