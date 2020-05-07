package odev;
import java.sql.*;
import javax.swing.JOptionPane;

public class veritabaniOlustur 
{
    private static veritabaniOlustur instance = null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    private final String url = "jdbc:postgresql://localhost/nesneOdev";
    private final String user = "postgres";
    private final String password = "131129";
    Connection dbConn=null;
    
    private veritabaniOlustur()
    {
        
    }
    public static veritabaniOlustur getInstance()
    {
	if(instance==null)
        {
            instance=new veritabaniOlustur();
	}
        return instance;
    }
    
    public Connection getConnection()
    {
	try
        {
            dbConn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
	}
        catch(SQLException e) 
        {
            System.out.println(e.getMessage());            
	}
        return dbConn;
    }
    
    public void kullaniciKontrol(kullanici k) throws SQLException
    {
        Statement stmt = dbConn.createStatement();
        String query = "select * from kullanici";
        ResultSet rs =  stmt.executeQuery(query);
        while (rs.next()) {
            String ad = rs.getString("kullaniciAdi");
            String sifre = rs.getString("sifre");
           if(ad.equals(k.getAd()) && sifre.equals(k.getSifre()))
           {
               JOptionPane.showMessageDialog(null,"Hoşgeldiniz");
               anaMenuPanel amp = new anaMenuPanel();
               girisPanel gp = new girisPanel();
               gp.setVisible(false);
               amp.setVisible(true);

           }
           else
           {
               JOptionPane.showMessageDialog(null,"Kullanıcı adı veya şifre yanlış.");
           }
        }
    }
}
