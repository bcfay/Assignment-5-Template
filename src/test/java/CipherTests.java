import static org.junit.Assert.assertEquals;

import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import org.junit.Test;


/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {

  @Test
  public void caesarCiphergetTextTest1(){
    CaesarCipher cipher = new CaesarCipher("hello");
    assertEquals("czggj", cipher.getText());
  }

  @Test
  public void caesarCiphergetTextTest2(){
    CaesarCipher cipher = new CaesarCipher("hello child");
    assertEquals("czggj xcdgy", cipher.getText());
  }

  @Test
  public void caesarCiphergetTextTest3(){
    CaesarCipher cipher = new CaesarCipher("HELLO child");
    assertEquals("CZGGJ xcdgy", cipher.getText());
  }

  @Test
  public void caesarCiphergetTextTest5(){
    CaesarCipher cipher = new CaesarCipher("h5llo chi7d");  //testing for numbers in string
    assertEquals("c5ggj xcd7y", cipher.getText());        //idk what result should be
  }
  @Test
  public void caesarCiphergetTextTest6(){
    CaesarCipher cipher = new CaesarCipher("AaBbCcDdEeFf");  //testing for numbers in string
    assertEquals("VvWwXxYyZzAa", cipher.getText());        //idk what result should be
  }
  @Test
  public void caesarCiphergetTextTest7(){
    CaesarCipher cipher = new CaesarCipher("");  //testing for numbers in string
    assertEquals("", cipher.getText());        //idk what result should be
  }
  @Test
  public void caesarCiphergetTextTest8(){
    CaesarCipher cipher = new CaesarCipher("ZzYyXxWwVv");  //testing for numbers in string
    assertEquals("UuTtSsRrQq", cipher.getText());        //idk what result should be
  }
  @Test
  public void caesarCiphergetTextTest9(){
    CaesarCipher cipher = new CaesarCipher(" ");  //testing for numbers in string
    assertEquals(" ", cipher.getText());        //idk what result should be
  }
  @Test
  public void caesarCiphergetTextTest10(){
    CaesarCipher cipher = new CaesarCipher("aaaammmm");  //testing for numbers in string
    assertEquals("vvvvhhhh", cipher.getText());        //idk what result should be
  }

  @Test
  public void elbonianCiphergetTextTest1(){
    ElbonianCipher cipher = new ElbonianCipher("a");
    assertEquals("01", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest2(){
    ElbonianCipher cipher = new ElbonianCipher(" ");
    assertEquals("S", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest3(){
    ElbonianCipher cipher = new ElbonianCipher("");
    assertEquals("", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest4(){
    ElbonianCipher cipher = new ElbonianCipher("A");
    assertEquals("01", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest5(){
    ElbonianCipher cipher = new ElbonianCipher("abcdefghijklmnopqrstuvwxyz");
    assertEquals("0102030405060708091011121314151617181920212223242526", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest6(){
    ElbonianCipher cipher = new ElbonianCipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    assertEquals("0102030405060708091011121314151617181920212223242526", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest7(){
    ElbonianCipher cipher = new ElbonianCipher("    ");
    assertEquals("SSSS", cipher.getText());
  }
}

