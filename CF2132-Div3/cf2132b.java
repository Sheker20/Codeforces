import java.util.*;
import java.io.*;
public class cf2132b{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while(T-- > 0){
            long n = sc.nextLong();
            Stack<Long> st = new Stack<>();
            long r = 1;
            long d = 1;
            while(n >= d){
                r *= 10;
                d = r + 1;
                if(n % d == 0){
                    st.push(n / d);
                }
            }
            System.out.println(st.size());
            while(!st.isEmpty()){
                System.out.print(st.pop() +" ");
            }  
            if(!st.isEmpty())          
            System.out.println();
        }
    }
}