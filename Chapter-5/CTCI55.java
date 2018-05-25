public class CTCI55 {
    public static int conversion(int num1, int num2) {
        int count=0;
        for (int diff = num1^num2; diff!=0; diff= diff & (diff-1) ) {
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println(conversion(10,12));
    }
}
