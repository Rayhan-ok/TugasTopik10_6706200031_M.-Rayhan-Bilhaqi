package TugasTopik10;

public class Driver extends Member{
    String noPlat, jenisMobil;

    public Driver(String nik, String nama, String noTelp, double saldo, String noPlat, String jenisMobil){
        super(nik, nama, noTelp, saldo);
        this.noPlat = noPlat;
        this.jenisMobil = jenisMobil;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getJenisMobil(){
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil){
        this.jenisMobil = jenisMobil;
    }
}
