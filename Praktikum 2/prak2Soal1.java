import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class prak2Soal1{
    public static void main(String arg[]) {
       Scanner nilai = new Scanner (System.in);
       System.out.print("Masukkan Nilai num1 = ");
       //input num1
       int num1 = nilai.nextInt();
       System.out.print("Masukkan Nilai num2 = ");
       //input num2
       int num2 = nilai.nextInt();
       System.out.println("num1 + num2 \t =" + (num1+num2));
       System.out.println("num1 - num2 \t =" + (num1-num2));
       System.out.println("num1 * num2 \t =" + (num1*num2));
       //digunakan String.format untuk set precision sehingga harus import library java.lang dan java.io
       System.out.println("num1 / num2 \t =" + (String.format("%.2f",((double)num1/num2))));
       System.out.println("num1 % num2 \t =" + (num1%num2));
    }
}
