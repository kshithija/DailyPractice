public class MaximumInAnArray {
    /*
     *   Input : n=4, arr = [1,2,3,4]
     *   Output : 4
     *
     *   Input : n=2, arr = [10, 11]
     *   output : 11
     *
     *  one way is to do via getting MIN_VALUE and comparing each elements
     * another way is to first sort the array and display the last element
     *
     * */
    public static void main(String[] args) {
        int[] arr= {1,12,3,4};

        maximumInArray(arr);


    }
    public static void maximumInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int items : arr){
           if(max <items){
               max = items;
           }
        }
        System.out.println(max);
    }
}
