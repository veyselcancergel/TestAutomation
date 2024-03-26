import org.example.maas_hesaplama;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class maasTestNg {
    @Test(groups= "unit")
    public void testHesaplama()
    {
        maas_hesaplama hesap = new maas_hesaplama();
        assertEquals(1000, hesap.hesapla(1, 1000));
    }

    @Test(groups= "unit", dataProvider = "params")
    public void testHesaplamaWithParam(Integer gun, Integer ucret)
    {
        maas_hesaplama hesap = new maas_hesaplama();
        assertEquals(gun * ucret, hesap.hesapla(gun, ucret));
    }

    @DataProvider(name="params")
    public Object[][] params()
    {
        return new Object[][]{
                {1, 1000},
                {2, 15000}
        };
    }
}
