import org.example.MojaKlasa;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestyKwadrat {
    @Test
    public void testKwadratDodatniejLiczby() {
        MojaKlasa klasa = new MojaKlasa();
        int wynik = klasa.kwadrat(5);
        assertEquals(25, wynik);
    }

    @Test
    public void testKwadratZerowejLiczby() {
        MojaKlasa klasa = new MojaKlasa();
        int wynik = klasa.kwadrat(0);
        assertEquals(0, wynik);
    }

    @Test
    public void testKwadratUjemnejLiczby() {
        MojaKlasa klasa = new MojaKlasa();
        int wynik = klasa.kwadrat(-3);
        assertEquals(9, wynik);
    }
}
