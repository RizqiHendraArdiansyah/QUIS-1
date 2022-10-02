public class pegawai {
    private String Nama;
    private String NIP;
    private double gajiPokok=2000;
    private double lembur=3000;
    private double uangMakan=3500;
    private double transport=4000;
    private double totalGaji;
    private int jumlahJamKerja;

    pegawai(String Nama , String NIP){
        this.Nama = Nama;
        this.NIP = NIP;
    }

    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public int getJamKerja(){
        return jumlahJamKerja;
    }
    public void hitungGajiHarian(){
        if(jumlahJamKerja > 0 && jumlahJamKerja <= 7){
            totalGaji = gajiPokok * jumlahJamKerja;
        }else if(jumlahJamKerja > 7 && jumlahJamKerja < 9){
            totalGaji = (gajiPokok*7) + ((jumlahJamKerja-7) * lembur) + uangMakan;
        }else if(jumlahJamKerja >= 9){
            totalGaji = (gajiPokok*7) + ((jumlahJamKerja-7) * lembur) + uangMakan + transport;
        }else{
            System.out.println("Jumlah Jam Kerja Tidak Valid");
        }
    }
    public void cetakPenghasilan(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|            Penghasilan Gaji          |");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("Nama Karyawan               :" + Nama);
        System.out.println("NIP                         :" + NIP);
        System.out.println("Gaji Pokok                  :" + gajiPokok);
        System.out.println("Lembur                      :" + lembur);
        System.out.println("UangMakan                   :" + uangMakan);
        System.out.println("Transport Lembur            :" + transport);
        System.out.println("total Gaji Yang Diterima    :" + totalGaji);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
 }
    