import java.util.Scanner;
public class pegawaiMain {
    public static void main(String[] args) throws Exception {
        Scanner ipt = new Scanner(System.in);
        String Nama , NIP;
        int jumlahPegawai , jumlahJamKerja;
        
        System.out.println("==========================");
        System.out.println(" DATA GAJI PEGAWAI PT.XYZ");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Jumlah Pegawai       : ");
        jumlahPegawai = ipt.nextInt();
        System.out.print("");
        
        for(int i = 0; i < jumlahPegawai; i++){
            System.out.println();
            System.out.println("Masukkan Nama Pegawai       : ");
            Nama = ipt.next();
            System.out.println("Masukkan NIP Pegawai        : ");
            NIP = ipt.next();
            pegawai pgw = new pegawai(Nama, NIP);
            System.out.println("Masukkan Total Jam Kerja      : ");
            jumlahJamKerja = ipt.nextInt();
            System.out.println();
    
            pgw.setJamKerja(jumlahJamKerja);
            pgw.hitungGajiHarian();
            pgw.cetakPenghasilan();
            System.out.print("");
        } 
    }
}