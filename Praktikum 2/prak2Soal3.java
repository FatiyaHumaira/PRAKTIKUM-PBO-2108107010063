public class prak2Soal3{
    public static void main(String arg[]){
        int i,j;
        //for i digunakan untuk baris ke i
        for(i=0; i<5; i++){
            //for j digunakan untuk mencetak *
            for(j=5; j>i; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}