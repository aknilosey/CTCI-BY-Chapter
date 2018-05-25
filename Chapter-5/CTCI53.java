public class CTCI53 {
    public static int flipBit(int num) {
        if (~num == 0) {
            return Integer.SIZE;
        }
        int previousLength = 0;
        int currentLength = 0;
        int maxLength = 1;

        while (num != 0) {

            if ((num & 1)==1) {
                currentLength +=1;
            }
            else if ((num & 1)==0) {
                previousLength = (num & 2) == 0 ? 0: currentLength; 
                currentLength = 0;
            }
            
            maxLength = Math.max(previousLength+currentLength+1,maxLength);
            num >>>=1;
        }
            return maxLength;
    }

     public static void main (String[] args) {
        System.out.println(flipBit(1775));
    }
}
