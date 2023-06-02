public class App {
    public static void main(String[] args) {
        int[] arr = {16,50,77,57,55,90}; 
        bubbleSort(arr);
        System.out.print("data yang telah di sorting = ");
        for (int i : arr) {
            System.out.print(i +" " );
        }


        int key = 57;
        long startTimeBinary = System.nanoTime();
        int hasilCari = binaryKampus(arr,key);
        long endTimeBinary = System.nanoTime();
        long subTimeBinary = endTimeBinary - startTimeBinary;

        if (hasilCari == -1) {
            System.out.println("array tidak ditemukan");
        }else{
            System.out.println("\nhasil array binary search di temukan di index = "+ hasilCari);   
        }
        System.out.println("Hasil waktu dari binart search = "+subTimeBinary + " nano second" );

        long startTimeLinear = System.nanoTime();
        int hasilCariLinear = linearSearch(arr,key);
        long endTimeLinear = System.nanoTime();
        long subTimeLinear = endTimeLinear - startTimeLinear;


        if (hasilCari == -1) {
            System.out.println("array tidak ditemukan");
        }else{
            System.out.println("hasil cari linear search di temukan di index = "+ hasilCariLinear);   
        }
        System.out.println("Hasil waktu dari binart search = "+subTimeLinear + " nano second" );

    }

    static void bubbleSort(int array[]) {
        int size = array.length;
        
        // loop to access each array element
        for (int i = 0; i < (size-1); i++) {
        
          // check if swapping occurs
          boolean swapped = false;
          
          // loop to compare adjacent elements
          for (int j = 0; j < (size-i-1); j++) {
    
            // compare two array elements
            // change > to < to sort in descending order
            if (array[j] > array[j + 1]) {
    
              // swapping occurs if elements
              // are not in the intended order
              int temp = array[j];
              array[j] = array[j + 1];
              array[j + 1] = temp;
              
              swapped = true;
            }
          }
          // no swapping means the array is already sorted
          // so no need for further comparison
          if (!swapped)
            break;
    
        }
      }


    static int binaryKampus(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2 ;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
    
        return -1;
    }

    static int linearSearch(int[] arr,int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

}