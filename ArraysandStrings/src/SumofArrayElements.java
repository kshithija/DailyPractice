public class SumofArrayElements {
    /*
    *   Input : n=4, arr = [1,2,3,4]
    *   Output : 10  i.e 4+ 3+ 2+1
    *
    *   Input : n=2, arr = [10, 11]
    *   output : 21 i.e 11+10
    * */

    public static void main(String[] args) {
        int[] arr= {1,2,3,4};

        sumOfArray(arr);


        }
    public static void sumOfArray(int[] arr){
        int sum = 0;
        for(int items : arr){
            sum = sum + items;
        }
        System.out.println(sum);
    }
}
