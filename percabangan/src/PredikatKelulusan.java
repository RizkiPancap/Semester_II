import java.util.Scanner;

public class PredikatKelulusan {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Jenjang Pendidikan ? (Magister atau Sarjana) = ");
        String InputVal = input.nextLine();
     

        if (InputVal.equals("Sarjana")){
            System.out.print("Masukan IPK = ");
            float Ipk = input.nextFloat();

            if (Ipk >= 3.51f ){
                System.out.print(Ipk + "  = Cuma Laude Sarjana");
            }

            else if (Ipk >= 3.01f && Ipk <= 3.5f ){
                System.out.print(Ipk + "  = Sangat Menuaskan Sarjana");
            }

            else if (Ipk >= 2.76f && Ipk <= 3.0f ){
                System.out.print(Ipk + "  = memuaskan Sarjana");
            }
            else if (Ipk >= 2.0f){
                System.out.print(Ipk + "  = Lulus Sarjana");
            }
            else{
                System.out.print(Ipk + "  =  Tidak Lulus Sarjana");
            }

        }

        else{
            
            System.out.print("Masukan IPK = ");
            float Ipk = input.nextFloat();

            if (Ipk >= 3.76f ){
                System.out.print(Ipk + "  = Cuma Laude Magister");
            }

            else if (Ipk >= 3.51f && Ipk <= 3.75f ){
                System.out.print(Ipk + "  = Sangat Menuaskan Magister");
            }

            else if (Ipk >= 3.01f && Ipk <= 3.5f ){
                System.out.print(Ipk + "  = memuaskan Magister");

            }
            else if (Ipk >= 3.0f){
                System.out.print(Ipk + "  = Lulus Magister");

            }
            else{
                System.out.print(Ipk + "  =  Tidak Lulus Magister");
            }

        }


        input.close();  
    }
}