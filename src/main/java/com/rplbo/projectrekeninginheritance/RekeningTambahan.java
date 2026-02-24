package com.rplbo.projectrekeninginheritance;

public class RekeningTambahan extends RekeningKeluarga{

    public RekeningTambahan(Nasabah nasabah) {
        super(nasabah);
    }

    @Override
    public void penarikan(int jumlah) {
        if (jumlah < 3000000){
            super.penarikan(jumlah);
        }
}
