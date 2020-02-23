import static org.junit.Assert.assertEquals;
import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.Message;
import org.junit.Test;

/**
 * Tests for your observer pattern; make sure your code works!
 * Test-driven development is a good idea here.
 */
public class ObserverTests {

  @Test
  public void notifierTests1(){
    Message mess = new Message();
    mess.setText("hello");
    CaesarCipher cipher = new CaesarCipher();
    cipher.setText("hi");
    mess.notifyObservers();
    assertEquals(mess.getText(), cipher.getText());
  }

}
