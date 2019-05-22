import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
    
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        if(t >= 0 && t <= 500){
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {
                    int sum = 0;
                    for (int j = 0; j < n; j++) {
                        int val = pow(2,j);
                        sum += val;
                        int f = a + sum*b;
                        System.out.print(f + " ");
                    }
                }
                System.out.println();
            }
        }
        in.close();
    }

    private static int pow(int a, int b) {
        int p = 1;
        for(int i = 1; i <= b; i++) {
            p *= a;
        }
        return p;
    }
}