import static org.junit.Assert.assertEquals;
import edu.wpi.cs3733.entity.CaesarCipher;
import edu.wpi.cs3733.entity.ElbonianCipher;
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
    CaesarCipher caes = new CaesarCipher();
    ElbonianCipher elbo = new ElbonianCipher();
    mess.register(caes);
    mess.register(elbo);
    caes.setText("not hello");
    elbo.setText("not hello");
    mess.setText("hello");
    assertEquals("hello", mess.getText());
    assertEquals("czggj", caes.getText());
    assertEquals("0805121215", elbo.getText());
  }



}
