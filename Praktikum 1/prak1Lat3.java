import java.util.Scanner;
public class prak1Lat3 {
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);
        
		    System.out.print("Jumlah Barang = ");
		    //diinput jumlah barangnya
		    int jumlah =  nilai.nextInt();
        
		    System.out.print("Harga satuan barang = ");
		    //diinput harga perunit
		    int harga =  nilai.nextInt();
        
		    /*
		    karena mendapat diskon 15 % maka harga yg dibayarkan hanya 85% dri harga awal
		    digunakan tipe data integer karena harga barang bernilai ribuan, 
		    sehingga tidak butuh tipe float/double
		    */
		    int harga_akhir = jumlah*harga*85/100;
        
        //cetak harga akhir
		    System.out.print("Harga Akhir = " + harga_akhir);
    }
}
