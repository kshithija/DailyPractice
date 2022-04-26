public class DistintElements {

    /* Input : n=5, a= [10,20,10,20,30]
    *  Output : 3
    *
    *  Input : n=7, a = [30,50,80,30,60,50,80]
    *  Output : 4
    * */

    public static void main(String[] args) {
        int[] arr= {};
        distintElements(arr);
    }

    private static void distintElements(int[] arr) {

        for(int i=0; i<arr.length; i++){
            int j;
            for (j=0; j< i; j++)
                if(arr[i]==arr[j])
                    break;
                if(i == j)
                    System.out.println(arr[i]);
        }
    }

}
