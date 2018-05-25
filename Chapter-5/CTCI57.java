public class CTCI57 {
    public static int pairWiseSwap(int num) {
       int result=0;
        result = ( ((num & 0xaaaaaaaa)>>>1) | ((num & 0x55555555)<<1));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pairWiseSwap(8));
    }
}
