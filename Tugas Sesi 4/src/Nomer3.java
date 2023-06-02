public class Nomer3 {
  public static void main(String[] args) throws Exception {
    int n = 8; //jumlah bilangan dalam deret
    int a = 0;
    int b = 1;
      System.out.print(a + " " + b + " ");
      for (int i = 2; i < n; i++) {
          int c = a + b;
         System.out.print(c + " ");
         a = b;
        b = c;
      }

  }
}
