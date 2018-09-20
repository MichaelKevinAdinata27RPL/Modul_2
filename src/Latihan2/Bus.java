package Latihan2;

public class Bus {

    private int penumpang;
    private int maxPenumpang;

    //konstruktor class bus
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }

    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang = " + penumpang);
        System.out.println("Penumoang maksimal seharusnya = " + maxPenumpang);
    }
    

}
