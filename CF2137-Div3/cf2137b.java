import java.util.*;

public class cf2137b
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            int ans = n + 1;
            for (int i = 0; i < n; i++) System.out.print(ans - b[i]+" ");
            System.out.println();
        }
    }
}
