import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CeaserCipherrTest {

    @Test
      public void  CeaserCipherTest_testingEncryptingmethod(){
        CeaserCipherrTest cipherr = new CeaserCipherrTest();
          assertEquals("ect", cipherr.encrypt("car",3));
      }
};
    @Test
    public void Cipher_testingDecryptingMethod() {
        CeaserCipherr cipherr =new CeaserCipherrTest();
        assertEquals("car",cipher.decrypt("ect",1));
    }


}







