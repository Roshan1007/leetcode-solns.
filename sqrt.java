//returning nearest largest int square root of any given number.

public class sqrt {
    public static void main(String[] args){
        int x=0;
        int ans=mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        int high=x;
        int low=0;
       while(low<=high){
        int mid=(high+low)/2;
        int val=mid*mid;
        if(val<=x){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return high;
    }
}   