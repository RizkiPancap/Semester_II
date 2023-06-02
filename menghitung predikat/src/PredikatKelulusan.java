import java.util.Scanner;

public class PredikatKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) {
        System.out.print(" Jenjang Pendidikan ? (Magister atau Sarjana) = ");
        String InputVal = input.nextInt();

        if (InputVal.equals("Sarjana")){
            System.out.print("Masukan IPK = ");
            float Ipk = input.nextFloat();

            if (Ipk >= 3.55f ){
                System.out.print(x: + " = Cum lauade"); 
            } else if (Ipk >= 3.00f && Ipk <= 3.50f){
                System.out.print(x + " = sangat memuaskan");
            } else if (Ipk >= 2.75f && Ipk <= 3.00f){
                System.out.print(Ipk + " = memuaskan");
            } else if (Ipk >= 3.00f && Ipk <= 3.50f){
                System.out.print(Ipk + " = lulus");
            } else{
                System.out.print(Ipk + " = Tidak Lulus");
            }
        }
        else{
            System.out.print("Masukkan IPK = ");
            float Ipk = input.nextFloat();

            if (Ipk > 3.75f){
                System.out.print(Ipk + " = Cum lauade");
            } else if (Ipk >= 3.50f && Ipk <= 3.75f) {
                System.out.print(Ipk + " = Sangat Memuaskan");
            } else if (Ipk >= 3.00f && Ipk <= 3.50f) {
                System.out.print(Ipk + " = Memuaskan");
            } else if (Ipk >= 3.50f && Ipk <= 3.75f) {
                System.out.print(Ipk + " = Sangat Memuaskan");
            } else{
                System.out.print(Ipk + " = Tidak Lulus");
            }
        }
    }

    }   
}