package TugasTopik10;

public class Member {
    String nik, nama, noTelp;
    double saldo = 0;

    public Member(String nik, String nama, String noTelp, double saldo){
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public String getNik(){
        return nik;
    }

    public String getNama(){
        return nama;
    }

    public String getNoTelp(){
        return noTelp;
    }

    public double getSaldo(){
        return saldo;
    }
}
