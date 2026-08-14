public class number_segregate {
    static void main() {
        int num =123000; // 135 246
        int pos=1;
        while(num >= pos)
            pos*=10;

       pos/=10;
       int even=0, odd=0;
       while(pos!=0)
       {
           int dig = num/pos;
           if(dig%2==0)
               even = even*10+dig;
           else odd = odd*10+dig;
           num%=pos;
           pos/=10;
       }
        System.out.println(Math.abs(odd-even));
    }
}
