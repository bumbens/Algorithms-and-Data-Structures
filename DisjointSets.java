import java.util.Scanner;


public class DisjointSets {
    Scanner scanner; 
    private int[] parent;
    private int[] size;

    public DisjointSets(int n) {
        parent = new int[n];
        size = new int[n];
        for(int i = 0; i < n; i++){
            parent[i] = i;
            size[i] = i;
        }
    }

    public int find(int p) {
        while (parent[p] != p) {
            p = parent[p];
        }
        return p;
    }

    public void union(int x, int y){
        int i = find(x);
        int j = find(y);

        if(size[i] <= size[j]){
            parent[i] = j;
            size[j] += size[i];
        } else {
            parent[j] = i;
            size[i] += size[j];
        }
    }

    public void query(int x, int y){
        if(find(x) == find(y)) System.out.println("1");
        else System.out.println("0");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        DisjointSets disjointSets = new DisjointSets(n);

        for(int i = 0; i<m; i++){
            int operation = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(operation == 0) disjointSets.query(x, y);
            if(operation == 1) disjointSets.union(x, y);
        }
        scanner.close();
    }
    
}