package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {


    public RekeningBisnis(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);

    @Override
    public void Penyetoran(int jumlah) {
        int total = jumlah + (int) bunga(jumlah);
        super.penyetoran(total);
        }



    }
}

