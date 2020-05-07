package odev;

import java.util.Random;

public class celciusSicaklik implements sicaklikInterface
{
    private double sicaklik;
    celciusSicaklik()
    {
        setSicaklik();
    }
    Random rand = new Random();
    public void setSicaklik()
    {
        sicaklik =rand.nextInt(30)+10;
    }


    public double getSicaklik()
    {
        return sicaklik;
    }
}
