public class ForLoop {
    public static void main(String[] args) {

        int n[] = {11,22,33,44,55,66};
        int sum =0, sumSq=0;
        double mean, stdDev;

        /* Compute sum and square sum using loop*/
        for(int i=0;i < n.length; i++){
            sum +=n[i];
            sumSq += n[i] * n[i];
        }

        /*Enhanced For Loop*/
        for(int item : n){
            //for each int item in int[] marks
            sum += item;
            sumSq += item * item;
        }

        mean = (double) sum/n.length;
        stdDev = Math.sqrt((double) sumSq / n.length - mean * mean);

        //print results
        System.out.printf("Mean us : %.2f%n", mean);
        System.out.printf("Stadard Deviation is : %.2f%n", stdDev);
    }
}
