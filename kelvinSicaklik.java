package odev;

import java.util.Random;

public class kelvinSicaklik implements sicaklikInterface
{
    private double sicaklik;
    kelvinSicaklik()
    {
        setSicaklik();
    }
    Random rand = new Random();
    public void setSicaklik()
    {
        int celcius=rand.nextInt(30)+10;
        sicaklik = celcius + 273.15;
    }

    public double getSicaklik()
    {
        return sicaklik;
    }
}
