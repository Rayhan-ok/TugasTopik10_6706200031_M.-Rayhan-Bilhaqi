package TugasTopik10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<Costumer> costumers = new ArrayList<>();

    public static void main(String[] args){
        int daftar;
        do {
            System.out.println("Daftar Pilihan : ");
            System.out.println("0. Memilih ulang");
            System.out.println("1. Input costumer");
            System.out.println("2. Input driver");
            System.out.println("3. Info costumers");
            System.out.println("4. Info drivers");
            System.out.println("5. Topup saldo costumer");
            System.out.println("6. Transaksi jasa pengantaran");
            daftar = in.nextInt();

            switch (daftar){
                case 0 : System.out.println("Keluar");
                break;
                case 1 : inputCostumer();
                break;
                case 2 : inputDriver();
                break;
                case 3 : infoCostumers();
                break;
                case 4 : infoDrivers();
                break;
                case 5 : topUpSaldoCostumer();
                break;
                case 6 : jasaPengataran();
                break;
                default: System.out.println("memilih daftar");
                break;
            }
        }while (daftar != 6);
    }

    static void inputCostumer(){
        String nik, nama, noTelp;
        double saldo;

        System.out.print("NIK : ");
        nik = in.next();
        System.out.print("Nama : ");
        nama = in.next();
        System.out.print("No Telp : ");
        noTelp = in.next();
        System.out.print("Saldo : ");
        saldo = in.nextDouble();

        costumers.add(new Costumer(nik, nama, noTelp, saldo));
        System.out.println();
    }

    static void inputDriver(){
        String nik, nama, noTelp, noPlat, jenisMobil;
        double saldo;

        System.out.print("NIK : ");
        nik = in.next();
        System.out.print("Nama : ");
        nama = in.next();
        System.out.print("No Telp : ");
        noTelp = in.next();
        System.out.print("Saldo : ");
        saldo = in.nextDouble();
        System.out.print("No Plat : ");
        noPlat = in.next();
        System.out.print("Jenis Mobil : ");
        jenisMobil = in.next();

        drivers.add(new Driver(nik, nama, noTelp, saldo, noPlat, jenisMobil));
        System.out.println();
    }

    static void infoCostumers(){
        for (Costumer costumer : costumers){
            System.out.println("Nik : " + costumer.getNik());
            System.out.println("Nama : " + costumer.getNama());
            System.out.println("No Telp : " + costumer.getNoTelp());
            System.out.println("Saldo : " + costumer.getSaldo() + "\n");
        }
        System.out.println();
    }

    static void infoDrivers(){
        for (Driver driver : drivers){
            System.out.println("Nik : " + driver.getNik());
            System.out.println("Nama : " + driver.getNama());
            System.out.println("No Telp : " + driver.getNoTelp());
            System.out.println("Saldo : " + driver.getSaldo());
            System.out.println("No Plat : " + driver.getNoPlat());
            System.out.println("Jenis Mobil : " + driver.getJenisMobil() + "\n");
        }
        System.out.println();
    }

    static void topUpSaldoCostumer(){
        int thisCostumer, thisDriver;
        double topUp;

        System.out.println("Pilih Costumer : ");
        thisCostumer = in.nextInt();
        System.out.println("Pilih Driver : ");
        thisDriver = in.nextInt();
        System.out.println("Tambah Saldo : ");
        topUp = in.nextDouble();

        drivers.get(thisDriver).saldo -= topUp;
        costumers.get(thisCostumer).saldo += topUp;

        System.out.println("Berhasil\n");
    }

    static void jasaPengataran(){
        int thisDriver, thisCostumer;
        double transaksi;

        System.out.println("Pilih Driver : ");
        thisDriver = in.nextInt();
        System.out.println("Pilih Costumer : ");
        thisCostumer = in.nextInt();
        System.out.println("Jumlah Transaksi : ");
        transaksi = in.nextDouble();

        costumers.get(thisCostumer).saldo -= transaksi;
        drivers.get(thisDriver).saldo += transaksi;

        System.out.println("Berhasil\n");
    }

}
