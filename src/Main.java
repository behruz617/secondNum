import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr ={12,35,1,10,34,1};

        int secondLargest=findSecondLargest(arr);

        if (secondLargest!=Integer.MIN_VALUE){
            System.out.println("The second largest element is : "+secondLargest);
        }else {
            System.out.println("No second largest element found");
        }


    }

    static int findSecondLargest(int []arr){
        if (arr.length<2){
            System.out.println("Array should have at least two elements");
            return Integer.MIN_VALUE;

        }
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int num:arr) {
            if (num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }else if (num>secondLargest &&num!=firstLargest){
                secondLargest=num;
            }
        }


        return secondLargest;
    }
}
