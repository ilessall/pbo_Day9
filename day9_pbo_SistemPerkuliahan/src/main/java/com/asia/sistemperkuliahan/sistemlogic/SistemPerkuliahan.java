/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.sistemperkuliahan.sistemlogic;

/**
 *
 * @author A-5
 */
public class SistemPerkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;
    private Mahasiswa[] dataMahasiswas;
    private Staf[] datasStafs;

    public SistemPerkuliahan() {
    }

    public SistemPerkuliahan(int maxPerkuliahans, int maxDosens, Mahasiswa[] dataMahasiswas, Staf[] datasStafs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.dataMahasiswas = dataMahasiswas;
        this.datasStafs = datasStafs;
    }
    
    

}

