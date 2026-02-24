package com.rplbo.projectrekeninginheritance;

public class RekeningSyariah extends Rekening{

    public RekeningSyariah(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningSyariah(Nasabah nasabah) {
        super(nasabah);
    }



    @Override
    public void penarikan(int jumlah) {
        int total = 0;
        if(jumlah  >10000){
            total = jumlah + 1000;
        } else  {
            total = jumlah;
        }
        super penarikan = jumlah;
    }
}
