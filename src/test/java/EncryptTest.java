import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EncryptTest {
    Encrypt testEncrypt = new Encrypt(2, "glen");
    @Test
    public void checkIfItCreatesInstance()
    {
        assertNotNull(testEncrypt);
    }
    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("glen", testEncrypt.getInputText() );
    }
    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testEncrypt.getKey());
    }
    @Test
    public void isNotEmpty()
    {
        assertTrue(testEncrypt.isNotEmpty());
    }
    @Test
    public void isValidInputText()
    {
        assertTrue(testEncrypt.isValidInputText());
    }
    @Test
    public void isValidKey()
    {
        assertTrue(testEncrypt.isValidKey());
    }
    @Test
    public void validEncoding()
    {
        assertEquals("glen" , testEncrypt.encode());
    }
}