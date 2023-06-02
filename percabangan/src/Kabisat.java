import java.util.Scanner;

public class Kabisat{   
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukan Tahun : ");
        int Tahun = inputan.nextInt();
        

        if (Tahun % 4 == 0) {
            System.out.print(Tahun+" Tahun Kabisat");
        }

        else{
            System.out.print(Tahun+" Bukan Tahun Kabisat");
        }
        
        }
    }