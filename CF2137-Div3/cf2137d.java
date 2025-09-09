import java.util.*;

public class cf2137d
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] res = new int[n];
            HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();
            for (int i = 0; i < n; i++)
            { 
                int x = sc.nextInt();
                h.putIfAbsent(x, new ArrayList<>());
                h.get(x).add(i);
            }
            boolean f = true;
            for(int i : h.keySet()){
                if(h.get(i).size() % i != 0){
                    System.out.println(-1);
                    f = false;
                    break;
                }
                if(!f) break;
            }
            if(!f) continue;
            int x = 1;
            for(int i : h.keySet()){
                List<Integer> l = h.get(i);
                int c = 0;
                for(int a : l){
                    res[a] = x;
                    c++;
                    if(c == i){
                        c = 0;
                        x++;
                    }
                }
                x++;
            }
            for(int i = 0; i < n; i++){
                System.out.print(res[i] +" ");
            }
            System.out.println();
        }
    }
}
