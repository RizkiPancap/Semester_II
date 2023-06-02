public class Nomer4 {
  public static void main (String[] args) throws Exception {
    for (int i = 4; i <= 6; i++) {
      for (int j = i; j <= i + 2; j++) {
          int hasil = i * j;
          System.out.println(i + " X " + j + " = " + hasil);
      }
  }
  
  }
}
