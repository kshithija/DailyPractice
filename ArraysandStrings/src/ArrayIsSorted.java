public class ArrayIsSorted {

    /*  Input : [10, 20, 30]
    *   Output : Yes
    *
    *   Input : [10,20,30,20]
    *   Output : No
    * */

    public static void main(String[] args) {
         int[] arr = {10,20,10,40};
        System.out.println(isSortArray(arr));
    }

    public static boolean isSortArray(int[] arr){
     for(int i=1; i< arr.length; i++){

             if(arr[i]<arr[i-1]){
                 return false;

         }
     }
     return true;
    }
}
