import java.util.*;

public class cf2137c
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = 0;
            if(a % 2 == 0 && b % 2 != 0){
                ans = -1;
            }
            else if(b % 2 == 0){
                ans = a * (b / 2) + 2;
            }
            else{
                ans = a * b + 1;
            }
            System.out.println(ans % 2 == 0 ? ans : -1);
        }
        
    }
}
