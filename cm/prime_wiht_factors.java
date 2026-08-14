public class prime_wiht_factors {
    static void main() {
        int num = 101;
        int i;
        for(i=2;i*i<=num;i+=1)
        {
            if(num%i==0)
                break;
        }
        if(i*i<=num)
            System.out.println("not prime");
        else System.out.println("prime");





    }
}
