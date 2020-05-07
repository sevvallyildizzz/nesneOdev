package odev;

import javax.swing.JOptionPane;

public class sogutucu implements observerInterface 
{
    @Override
    public void update()
    {
        if(durum==true){
            sogutucuyuKapat();
            JOptionPane.showMessageDialog(null,"Soğutucu kapatıldı");
        }
        else
        {
            sogutucuyuAc();
            JOptionPane.showMessageDialog(null,"Soğutucu açıldı");
        }
    }
    private boolean durum;
    sogutucu()
    {
        durum=false;
    }
    public void sogutucuyuAc()
    {
        durum=true;
    }
    public void sogutucuyuKapat()
    {
        durum=false;
    }
    public boolean getDurum()
    {
        return durum;
    }
}
