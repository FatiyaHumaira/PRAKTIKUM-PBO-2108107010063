import java.util.Scanner;

public class prak2Soal2{ 
    public static void main(String arg[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        if( (nilai>100) || (nilai<0)){
            System.out.println("Nilai yang dimasukkan tidak valid");
        }
        else if(nilai>=87){
            System.out.println("Nilai huruf ialah A dengan IP 4.0");
        }
        else if(nilai>=78){
            System.out.println("Nilai huruf ialah AB dengan IP 3.5");
        }
        else if(nilai>=69){
            System.out.println("Nilai huruf ialah B dengan IP 3.0");
        }
        else if(nilai>=60){
            System.out.println("Nilai huruf ialah BC dengan IP 2.5");
        }
        else if(nilai>=51){
            System.out.println("Nilai huruf ialah C dengan IP 2.0");
        }
        else if(nilai>=41){
            System.out.println("Nilai huruf ialah D dengan IP 1.0");
        }
        else{
            System.out.println("Nilai huruf ialah E dengan IP 0.0");
        }
    }
}