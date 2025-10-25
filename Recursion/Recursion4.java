public class Recursion4 {
    public static int calcPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowernm1 = calcPower(x, n-1);
        int xPowern = x * xPowernm1;
        return xPowern;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
