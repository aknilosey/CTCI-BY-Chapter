public class CTCI52 {
    public static String binaryToString(double num) {
        if ( num >= 1 || num <= 0) {
            return "Error";
        }
        StringBuilder binaryString = new StringBuilder();
        binaryString.append(".");
        while (num > 0 && binaryString.length()<32) {
            if (binaryString.length() > 32) {
                return "Error";
            }
            double doubleNum = num * 2.0;
            if (doubleNum >= 1) {
                binaryString.append(1);
                num = doubleNum - 1.0;
            }
            else {
                binaryString.append(0);
                num = doubleNum;
            }
        }
        return binaryString.toString();
    }

    public static void main(String[] args) {
        System.out.println(binaryToString(.5));
    }
}
