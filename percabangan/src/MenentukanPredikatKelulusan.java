import java.util.Scanner;

public class MenentukanPredikatKelulusan {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Masukkan jenis program studi Anda (S/M): ");
      String programStudi = input.next();

      if (programStudi.equalsIgnoreCase("S")) { // program studi sarjana
         System.out.print("Masukkan IPK Anda: ");
         double ipk = input.nextDouble();

         if (ipk >= 3.5) {
            System.out.println("Predikat Anda adalah: Cum Laude");
         } else if (ipk >= 3.0 && ipk < 3.5) {
            System.out.println("Predikat Anda adalah: Sangat Memuaskan");
         } else if (ipk >= 2.5 && ipk < 3.0) {
            System.out.println("Predikat Anda adalah: Memuaskan");
         } else if (ipk >= 2.0 && ipk < 2.5) {
            System.out.println("Predikat Anda adalah: Lulus");
         } else {
            System.out.println("Predikat Anda adalah: Tidak Lulus");
         }
      } else if (programStudi.equalsIgnoreCase("M")) { // program studi magister
         System.out.print("Masukkan IPK Anda: ");
         double ipk = input.nextDouble();

         if (ipk >= 3.75) {
            System.out.println("Predikat Anda adalah: Sangat Memuaskan");
         } else if (ipk >= 3.50 && ipk < 3.75) {
            System.out.println("Predikat Anda adalah: Memuaskan");
         } else {
            System.out.println("Predikat Anda adalah: Tidak Lulus");
         }
      } else {
         System.out.println("Program studi yang Anda masukkan tidak valid.");
      }
   }
}