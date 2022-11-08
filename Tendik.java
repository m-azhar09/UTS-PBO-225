public class Tendik extends Karyawan {
    private int jam,bonusan;



    @Override
    public void hasil() {
        System.out.println("Pendapatan total : Rp."+gaji);;
    }
    //overloading
    public void lembur2(){
            System.out.println("Bonus Lembur : Rp."+bonusan);
    }
    public void lembur2( int jam){
            bonusan=(500000*jam)+gaji;
        }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

}
