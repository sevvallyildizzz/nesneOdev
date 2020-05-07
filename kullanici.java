package odev;

public class kullanici 
{
    private String kAdi;
    private String sifre;
    private double cihazSicaklik;
    celciusSicaklik sicaklik=new celciusSicaklik();
    sogutucu sogutucu1=new sogutucu();
    public sogutucu getSogutucu()
    {
        return sogutucu1;
    }
    public void setCihazSicaklik()
    {
        cihazSicaklik=sicaklik.getSicaklik();
    }
    public double getCihazSicaklik()
    {
        setCihazSicaklik();
        return cihazSicaklik;
    }
    
    public void setAd(String ad)
    {
	this.kAdi=ad;
    }
	
    public String getAd()
    {
	return kAdi;
    }
	
    public void setSifre(String parola)
    {
	this.sifre=parola;
    }
    public String getSifre()
    {
	return sifre;
    }
}
