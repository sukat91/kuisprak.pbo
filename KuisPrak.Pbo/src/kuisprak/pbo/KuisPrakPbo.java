/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuisprak.pbo;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class KuisPrakPbo {

    /**
     * @param args the command line arguments
     */
  
       public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
         double jurnal = 0 , data = 0 , solving = 0, esai = 0, visualisasi = 0 , thinking = 0,hasilbeapelajar = 0,hasilbeamahasiswa = 0;
        int pilih,usia;
        String nama;
        System.out.println("=============================================");
        System.out.println("|      Pendaftaran Beasiswa PT. Soekat      |");
        System.out.println("=============================================");
        System.out.println("| Terdapat 2 Program Beasiswa yang dibuka : |");
        System.out.println("|   1. Beasiswa Pelajar                     |");
        System.out.println("|   2. Beasiswa Mahasiswa                   |");
        System.out.println("=============================================");
        System.out.print("Pilih Beasiswa yang didaftar : ");
        pilih = Input.nextInt();
        
       switch (pilih){
           case 1 : 
               System.out.println(" --- Form Pendaftaran --- ");
            System.out.print("Nama Lengkap   : ");
            Scanner napel = new Scanner(System.in);
            nama = napel.nextLine();
            System.out.print("Usia     : ");
            usia = Input.nextInt();
       
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
                System.out.print("Nilai Struktur dan Konten Esai   : ");
                esai = Input.nextDouble();
                System.out.print("Nilai Teknik Visualisasi         : ");
                visualisasi = Input.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking  : ");
                thinking = Input.nextDouble();
              
            } while (esai > 100 || esai < 0 ||  visualisasi > 100 ||  visualisasi < 0 || thinking < 0 ||  thinking > 100 );
            do {
                System.out.println(" +++  Menu  +++ ");
                System.out.println(" 1. Tampilkan Hasil  ");
                System.out.println(" 2. Ubah Nilai    ");
                System.out.println(" 3. Keluar  ");
                System.out.print("Pilih : ");
                pilih = Input.nextInt();
                
                if (pilih == 1) {
                
                    
                    Seleksi seleksi;
                   seleksi = new Seleksi( jurnal, data,  solving,  esai,  visualisasi,  thinking,  hasilbeapelajar,  hasilbeamahasiswa) ;
                   hasilbeapelajar = seleksi.hasilbeapelajar();
                    System.out.println("Nilai Akhir : " + hasilbeapelajar);
                    if (hasilbeapelajar >= 87.5 && usia >= 16 && usia <= 24) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dinyatakan  diterima pada program BEASISWA PELAJAR karena sudah mencapai nilai yang diharapkan pada tahap seleksi");
                         }
                    else {
                        System.out.println("Keterangan : TIDAK BERHASIL");
                        System.out.println("MOHON MAAF " + nama + " dinyatakan tidak diterima pada program BEASISWA PELAJAR karena belum mencapai nilai yang diharapkan pada tahap seleksi");

                    }
                 } 
                else if (pilih == 2) {
                    do {
                        System.out.println(" --- Form Penilaian --- ");
                System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
                System.out.print("Nilai Struktur dan Konten Esai   : ");
                esai = Input.nextDouble();
                System.out.print("Nilai Teknik Visualisasi         : ");
                visualisasi = Input.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking  : ");
                thinking = Input.nextDouble();
                    } while (esai > 100 || esai < 0 ||  visualisasi > 100 ||  visualisasi < 0 || thinking < 0 ||  thinking > 100 );
                }
            } while (pilih != 3);
            break;
     
              case 2 :
             
                   System.out.println(" --- Form Pendaftaran --- ");
            System.out.print("Nama Lengkap   : ");
             Scanner namah = new Scanner(System.in);
            nama = namah.nextLine();
            System.out.print("Usia           : ");
            usia = Input.nextInt();
       
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
                System.out.print("Nilai Struktur dan Konten Jurnal   : ");
                jurnal = Input.nextDouble();
                System.out.print("Nilai Relevansi Data               : ");
                data = Input.nextDouble();
                System.out.print("Kemampuan Problem Solving          : ");
                solving = Input.nextDouble();
              
            } while (jurnal > 100 || jurnal < 0 ||  data > 100 ||  data < 0 || solving < 0 ||  solving > 100 );
            do {
                System.out.println(" +++  Menu  +++ ");
                System.out.println(" 1. Tampilkan Hasil  ");
                System.out.println(" 2. Ubah Nilai    ");
                System.out.println(" 3. Keluar  ");
                System.out.print("Pilih : ");
                pilih = Input.nextInt();
                
                if (pilih == 1) {
                
                    
                    Seleksi seleksi;
                   seleksi = new Seleksi( jurnal, data,  solving,  esai,  visualisasi,  thinking,  hasilbeapelajar,  hasilbeamahasiswa) ;
                   hasilbeamahasiswa = seleksi.hasilbeamahasiswa();
                    System.out.println("Nilai Akhir : " + hasilbeamahasiswa);
                   if (hasilbeamahasiswa >= 87.5 && usia >= 16 && usia <= 24) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dinyatakan  diterima pada program BEASISWA MAHASISWA karena sudah mencapai nilai yang diharapkan pada tahap seleksi");
                         }
                    else  {
                        System.out.println("Keterangan : TIDAK BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dinyatakan  diterima pada program BEASISWA MAHASISWA karena sudah mencapai nilai yang diharapkan pada tahap seleksi");
                    }
                 } 
                else if (pilih == 2) {
                    do {
                   System.out.println(" --- Form Penilaian --- ");
                System.out.println("Keterangan : Nilai yang valid berada di antara 0 - 100");
                System.out.print("Nilai Struktur dan Konten Jurnal   : ");
                jurnal = Input.nextDouble();
                System.out.print("Nilai Relevansi Data               : ");
                data = Input.nextDouble();
                System.out.print("Kemampuan Problem Solving          : ");
                solving = Input.nextDouble();
                    } while (jurnal > 100 || jurnal < 0 ||  data > 100 ||  data < 0 || solving < 0 ||  solving > 100 );
                }
            } while (pilih != 3);
    
            }
            }
}
       
            
