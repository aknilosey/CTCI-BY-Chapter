public class CTCI51 {
    public static int InsertBit(int m, int n, int i, int j) {
        //steps: masks bit between i and j
        //
        int allOnes = ~0;
        int leftBits = allOnes <<(j+1);
        int rightBits = ((allOnes << i) -1);
        int mask = leftBits| rightBits;
        int clearedBits = n & mask;
        int movedM = m<<i;
        int result = clearedBits|movedM; 
        return result;
    }

    public static void main(String[] args) {
        int m = 40;
        int n = 20;
        System.out.println(InsertBit(m,n,2,4));
    }
}
