import java.util.Random;
public class liuning {
    public static void main(String[] args) {

        int[]arr=new int[10];
        Random ran=new Random();
        int sum =0;

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ran.nextInt(10);
            System.out.print(arr[i]+" ");
            sum+=arr[i];

        }
        System.out.println(sum);
        System.out.println();
        int max=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }

}
