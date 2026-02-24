package com.rplbo.projectrekeninginheritance;

public class RekeningKeluarga extends Rekening{


    public RekeningKeluarga(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public RekeningKeluarga(Nasabah nasabah) {
        super(nasabah);
    }

    @Override
    public void penyetoran(int jumlah) {
        int total = jumlah + bunga(jumlah);
    }

    @Override
    public void penarikan(int jumlah) {
        return (int) (jumlah * 0.5/100);
    }

    @Override
    public void getNasabah() {
        return super.getNasabah();
    }
}
}
