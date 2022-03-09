import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DecryptTest {
    Decrypt testDecrypt = new Decrypt( 2, "ingp");
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("ingp", testDecrypt.getmInputText() );
    }
    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testDecrypt.getmKey());
    }
    @Test
    public void isValidInputText()
    {
        assertTrue(testDecrypt.isValidInputText());
    }
    @Test
    public void isValidKey()
    {
        assertTrue(testDecrypt.isValidKey());
    }
    @Test
    public void validDecoding()
    {
        assertEquals("glen" , testDecrypt.decode());
    }
}
