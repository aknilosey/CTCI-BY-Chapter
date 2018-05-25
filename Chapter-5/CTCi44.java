public class CTCi44 {
    public static int getNextNumber(int num) {
        int numberOfTrailingZeros = 0;
        int numberOfOnes = 0;
        int temp = num;
        int positionOfZeroInMid = 0;

        while (((temp&1)==0) && (temp!=0)) {
            numberOfTrailingZeros++;
            temp >>= 1;
        }
        
        while ((temp&1) ==1) {
            numberOfOnes++;
            temp >>= 1;
        }

        positionOfZeroInMid = numberOfTrailingZeros+numberOfOnes;
        
        if (positionOfZeroInMid == 31 || positionOfZeroInMid == 0) {
            return -1;
        }

        num |= 1<<positionOfZeroInMid;
        num &= ~((1<<positionOfZeroInMid)-1);
        num |= (1<<(numberOfOnes-1))-1;
        
        return num;
    }

    public static int getPrevNumber (int num) {
        int numberOfZeros = 0;
        int numberOfTrailingOnes = 0;
        int temp = num;
        int positionOfOneInMid;
        int mask;
        while ((temp & 1) == 1) {
            numberOfTrailingOnes++;
            temp >>= 1;
        }

        while ((temp & 1) == 0 && (temp!= 0)) {
            numberOfZeros++;
            temp >>= 1;
        }
        positionOfOneInMid = numberOfTrailingOnes+numberOfZeros; 
        num &= (~0)<<(positionOfOneInMid+1);
        mask = (1<<(numberOfTrailingOnes+1))-1;
        num |= mask << (numberOfZeros)-1;
        return num;
    }

    public static void main(String args[]) {
        System.out.println(getNextNumber(10));
        System.out.println(getPrevNumber(10));
    }
}
