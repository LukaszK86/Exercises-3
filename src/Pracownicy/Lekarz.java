package Pracownicy;
import com.jetbrains.Main;
/**
 * Created by Kuki on 27.05.2017.
 */
public class Lekarz extends Main {
    private double premia;

    public Lekarz(String imie, String nazwisko, double wyplata) {
        super(imie, nazwisko, wyplata);
        premia = 0;
    }

    public double getPremia()
    { return premia; }
    public void setPremia(double d)
    {
        premia = d;
    }

}
