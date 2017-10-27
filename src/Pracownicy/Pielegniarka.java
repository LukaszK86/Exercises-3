package Pracownicy;

import com.jetbrains.Main;

/**
 * Created by Kuki on 27.05.2017.
 */
public class Pielegniarka extends Main {

    private int nadgodziny;

    public Pielegniarka(String imie, String nazwisko) {
        super(imie, nazwisko);
        nadgodziny = 0;
    }

    public int getNadgodziny()
    { return nadgodziny; }
    public void setNadgodziny(int n)
    {
        nadgodziny += n;
    }

}