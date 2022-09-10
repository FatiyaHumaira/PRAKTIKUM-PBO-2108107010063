public class prak2Soal5{
    public static void main(String arg[]){
        int i;
        for(i=1; i<=20; i++){
            if((i % 2 != 0) || (i % 6 == 0)){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}