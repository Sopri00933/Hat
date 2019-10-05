import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
@ManagedBean
@RequestScoped
@SessionScoped
public class ManageBeanSinifi {
    String isimSoyisim;
    String adres;
    String il;
    String parola;
    List<String> cinsiyet=new ArrayList<String>();
    String ehliyetVarMi;
    boolean kabulEdildiMi;
    String mesaj;

    public String getisimSoyisim() {
        return isimSoyisim;
    }

    public void setisimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public List<String> getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(List<String> cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getEhliyetVarMi() {
        return ehliyetVarMi;
    }

    public void setEhliyetVarMi(String ehliyetVarMi) {
        this.ehliyetVarMi = ehliyetVarMi;
    }

    public boolean isKabulEdildiMi() {
        return kabulEdildiMi;
    }

    public void setKabulEdildiMi(boolean kabulEdildiMi) {
        this.kabulEdildiMi = kabulEdildiMi;
    }

    public String getMesaj() {
        if(!kabulEdildiMi)
        {
            mesaj ="Şartları Kabul Etmediniz";
        }
        else
        {
            mesaj ="Şartları Kabul Ettiniz";
        }
        return mesaj;
    }
    
    public class ilkBean() {
    
    private HibernateUtil hu;
    private Session ses;
    private Hasta hasta;
    private List <Hasta> Liste;
    
    public ilkBean()  {   
    }
    public List <Hasta> hastagetir() {
        Liste = new ArrayList<>();
        ses = hu.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu=ses.createQuery("From Hasta");
        liste = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return liste;
    }
  }
}
