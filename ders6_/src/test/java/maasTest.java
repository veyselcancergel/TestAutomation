import org.example.maas_hesaplama;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class maasTest {
    @Test
   public void testHesaplama()
    {
        maas_hesaplama hesap = new maas_hesaplama();
        assertEquals(1000, hesap.hesapla(1, 1000));
    }
}
