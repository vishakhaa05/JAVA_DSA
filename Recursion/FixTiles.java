public class FixTiles {
    public static int placeTiles(int n , int m){
        if (n == 0){
            return 2;
        }
        if (n < m){
            return 1;
        }
        int verticalWays = placeTiles(n-m, m);
        int horizontalWays =placeTiles(n-1,m);
        return verticalWays + horizontalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 2;
       System.out.println(placeTiles(n, m));
    }}
