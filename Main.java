import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Dosen DN= new Dosen();
        Tendik TK= new Tendik();

        DN.setNidn("225");
        DN.setNama("Kirito");
        DN.setNip("900225");
        DN.setTglLahir("9-5-2002");
        DN.setGen("LAKI-LAKI");
        DN.setThnMasuk("2026");
        DN.setJurusan("INFORMATIKA");
        DN.setAlamat("Karangpucung");

        DN.lembur(6);

        TK.setNama("Klein");
        TK.setNip("500223");
        TK.setTglLahir("5-9-2000");
        TK.setGen("LAKI-LAKI");
        TK.setThnMasuk("2026");
        TK.setAlamat("Cilacap");

        TK.lembur2(20);

        System.out.println("NIP Dosen       : "+DN.getNip());
        System.out.println("NIDN            : "+DN.getNidn());
        System.out.println("Nama Dosen      : "+DN.getNama());
        System.out.println("Jenis Kelamin   : "+DN.getGen());
        System.out.println("Tgl Lahir       : "+DN.getTglLahir());
        System.out.println("Alamat          : "+DN.getAlamat());
        System.out.println("Jurusan         : "+DN.getJurusan());
        System.out.println("Tahun Masuk     : "+DN.getThnMasuk());
        DN.lembur();
        DN.hasil();

        System.out.println("");
        System.out.println("NIP Tendik     : "+TK.getNip());
        System.out.println("Nama Tendik    : "+TK.getNama());
        System.out.println("Jenis Kelamin  : "+TK.getGen());
        System.out.println("Tgl Lahir      : "+TK.getTglLahir());
        System.out.println("Alamat         : "+TK.getAlamat());
        System.out.println("Tahun Masuk    : "+TK.getThnMasuk());
        TK.lembur2();
        TK.hasil();




    }
}