public class Dosen extends Karyawan{
private int sks,bonusLebih;
private String nidn,jurusan;



    @Override
    public void hasil() {
        System.out.println("Pendapatan total : Rp."+gaji);;
    }
    //Overloading
    public void lembur(){
        System.out.println("Bonus Lembur : Rp."+bonusLebih);
    }
    public void lembur( int sks){
    bonusLebih= (100000*sks)+gaji;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

}
