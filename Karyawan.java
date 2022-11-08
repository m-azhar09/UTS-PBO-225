public class Karyawan {
    protected String nip ,nama , alamat , gen,tglLahir,thnMasuk;
    protected int gaji = 2000000;

    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setThnMasuk(String thnMasuk) {
        this.thnMasuk = thnMasuk;
    }

    public String getThnMasuk() {
        return thnMasuk;
    }

    public void hasil(){
        System.out.println("Pendapatan total : Rp."+gaji);
    }
}
