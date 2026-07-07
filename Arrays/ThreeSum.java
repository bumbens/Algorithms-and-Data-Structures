package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    
    private static boolean hasTriplet(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        if(n < 3) return false;
        for(int i = 0; i < n - 2; i++){
            
            int l = i + 1, r = n - 1;
            int reqTarget = target - arr[i];

            while(l < r){
                if(arr[l] + arr[r] == reqTarget)        return true;
                else if(arr[l] + arr[r] < reqTarget)    l++;
                else if(arr[l] + arr[r] > reqTarget)    r--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int target = scanner.nextInt();

        for(int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();

        scanner.close();

        System.out.println(hasTriplet(arr, target));
        
    }
}

/* 
INPUT FORMAT: N, then target, then N integers (array elements)

SAMPLE INPUT:
************************

6
13
1 4 45 6 10 8
returns true (1 + 4 + 8) 

***********************

5
100
1 2 3 4 5
returns false (no such triplet)

*/
