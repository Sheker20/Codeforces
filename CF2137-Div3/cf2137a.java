import java.util.*;

public class cf2137a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            System.out.println((int)(Math.pow(2, k) * x));
        }
        
    }
}
