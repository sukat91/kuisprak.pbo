/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuisprak.pbo;

/**
 *
 * @author HP
 */
import beasiswa.BeasiswaMahasiswa;
import beasiswa.BeasiswaPelajar;

public class Seleksi implements BeasiswaMahasiswa,BeasiswaPelajar {

    double jurnal, data, solving, esai, visualisasi, thinking, hasilbeapelajar, hasilbeamahasiswa;

    public Seleksi(double jurnal, double data, double solving, double esai, double visualisasi, double thinking, double hasilbeapelajar, double hasilbeamahasiswa) {
        this.jurnal = jurnal;
        this.data = data;
        this.solving = solving;
        this.esai = esai;
        this.visualisasi = visualisasi;
        this.thinking = thinking;
        this.hasilbeapelajar = hasilbeapelajar;
        this.hasilbeamahasiswa = hasilbeamahasiswa;
        
    }
    

    @Override
    public double jurnal() {
        jurnal = jurnal*0.6;
        return jurnal;
    }

    @Override
    public double data() {
        data = data*0.25;
        return data;
    }

    @Override
    public double solving() {
        solving = solving*0.15;
        return solving;
    }

    @Override
    public double esai() {
        esai = esai*0.5;
        return esai;
    }

    @Override
    public double visualisasi() {
        visualisasi = visualisasi*0.2;
        return visualisasi;
    }

    @Override
    public double thinking() {
        thinking = thinking*0.3;
        return thinking;
    }

    @Override
    public double hasilbeamahasiswa() {
      hasilbeamahasiswa = jurnal()+data()+solving();
      return hasilbeamahasiswa;
    }

    @Override
    public double hasilbeapelajar() {
        hasilbeapelajar = esai()+visualisasi()+thinking();
        return hasilbeapelajar;
    }

    
    
   
}
