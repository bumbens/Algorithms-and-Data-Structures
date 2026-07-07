import java.util.Scanner;

/**
 * Exercises
 */
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