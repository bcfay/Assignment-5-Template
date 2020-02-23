import static org.junit.Assert.assertEquals;

import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
import edu.wpi.cs3733.entity.Message;
import org.junit.Test;


/**
 * Tests for your cipher functions; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class CipherTests {

  @Test
  public void caesarCiphergetTextTest1(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("hello");
    assertEquals("czggj", cipher.getText());
  }

  @Test
  public void caesarCiphergetTextTest2(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("hello child");
    assertEquals("czggj xcdgy", cipher.getText());
  }

  @Test
  public void caesarCiphergetTextTest3(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("HELLO child");
    assertEquals("CZGGJ xcdgy", cipher.getText());
  }

  @Test
  public void caesarCiphergetTextTest5(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("h5llo chi7d");
    assertEquals("c5ggj xcd7y", cipher.getText());
  }
  @Test
  public void caesarCiphergetTextTest6(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("AaBbCcDdEeFf");
    assertEquals("VvWwXxYyZzAa", cipher.getText());
  }
  @Test
  public void caesarCiphergetTextTest7(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("");
    assertEquals("", cipher.getText());
  }
  @Test
  public void caesarCiphergetTextTest8(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("ZzYyXxWwVv");
    assertEquals("UuTtSsRrQq", cipher.getText());
  }
  @Test
  public void caesarCiphergetTextTest9(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText(" ");
    assertEquals(" ", cipher.getText());
  }
  @Test
  public void caesarCiphergetTextTest10(){
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("aaaammmm");
    assertEquals("vvvvhhhh", cipher.getText());
  }

  @Test
  public void elbonianCiphergetTextTest1(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText("a");
    assertEquals("01", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest2(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText(" ");
    assertEquals("S", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest3(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText("");
    assertEquals("", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest4(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText("A");
    assertEquals("01", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest5(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText("abcdefghijklmnopqrstuvwxyz");
    assertEquals("0102030405060708091011121314151617181920212223242526", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest6(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    assertEquals("0102030405060708091011121314151617181920212223242526", cipher.getText());
  }
  @Test
  public void elbonianCiphergetTextTest7(){
    ElbonianCipher cipher = new ElbonianCipher();
    cipher.setText("    ");
    assertEquals("SSSS", cipher.getText());
  }
}

