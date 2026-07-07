package UnionFind;
import java.util.Scanner;

public class QuickFind {

    public static int[] union(int[] id, int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }

        }
        return id;
    }

    public static int find(int[] id, int f) {
        return id[f];
    }

    public static boolean connected(int[] id, int p, int q) {
        return id[p] == id[q];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] id = new int[N];
        for (int i = 0; i < id.length; i++)
            id[i] = i;

        while (scanner.hasNextInt()) {

            int p = scanner.nextInt();
            int q = scanner.nextInt();

            union(id, p, q);

        }

        scanner.close();

        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();

        System.out.println(find(id, 6));
    }
}

/*
INPUT FORMAT: N, then pairs of integers (p q) 

SAMPLE INPUT:
************************

10
9 0
3 4
5 8
7 2
2 1
5 7
0 3
4 2

id[] after all unions: 1 1 1 1 1 1 6 1 1 1
find(id, 6) returns: 6

************************

10
4 3
3 8
6 5
9 4
2 1
8 9
5 0
7 2
6 1
1 0
6 7

id[] after all unions: 1 1 1 8 8 1 1 1 8 8
find(id, 6) returns: 1

*/