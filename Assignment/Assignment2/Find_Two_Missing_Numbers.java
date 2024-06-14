import java.util.*;
public class Find_Two_Missing_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n-2];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int xor=0;
        int v=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
            v^=i;
        }
        v=v^(n-2)^(n-1)^n;
        xor^=v;
        int diff=xor & -xor;
        int d1=0,d2=0;
        for(int i=1;i<=n;i++){
            if((diff & i) ==0){
                d1^=i;
            }else{
                d2^=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if((diff & arr[i])==0){
                d1^=arr[i];
            }else{
                d2^=arr[i];
            }
        }

        System.out.print(d1 +","+ d2);
    }
}
