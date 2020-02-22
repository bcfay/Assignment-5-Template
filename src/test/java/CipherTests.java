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
  public void caesarCiphergetTextTest4(){
    CaesarCipher cipher = new CaesarCipher("h5llo chi7d");  //testing for numbers in string
    assertEquals("c5ggj xcd7y", cipher.getText());        //idk what result should be
  }

  @Test
  public void elbonianCiphergetTextTest1(){
    ElbonianCipher cipher = new ElbonianCipher("This is a message");
    assertEquals(cipher.getText(), "20080919S0919S01S13051919010705");
  }

}

