package c4q.lighterletter;

public class Main {

    public static void main(String[] args){

        System.out.println("-8 in decimal: " + DecimalToBinary(-8,2));

        calcDecimalToBinary(134, 562);

        calcDecimalToBinary(51, - 8);

        //octal 52 is 0o64

        numOf1sInBinary();

        System.out.println(isPalindrone(DecimalToBinary(7, 2))); // kinda broken, I need to fix it.
        

    }
    public static String DecimalToBinary(int number, int groupSize) {
        StringBuilder result = new StringBuilder();

        for(int i = 12; i >= 0 ; i--) {
            int mask = 1 << i;
            result.append((number & mask) != 0 ? "1" : "0");

            if (i % groupSize == 0)
                result.append(" ");
        }
        result.replace(result.length() - 1, result.length(), "");

        return result.toString();
    }
    public static void calcDecimalToBinary(int one, int two){
        System.out.println(one+": "+Integer.toBinaryString(one));
        System.out.println("+");
        System.out.println(two+": "+Integer.toBinaryString(two));
        System.out.println(" = ");
        System.out.println("binary String: "+Integer.toBinaryString(one + two) + "\n");
        System.out.println(one + two + " in decimal val: " + Integer.parseInt(Integer.toBinaryString(one + two), 2));
    }
    public static void numOf1sInBinary(){
        //number of 1's in binary representation
        String number = Integer.toBinaryString(51 + -8);
        int posValNum = 0;
        for(int i = 0; i < number.length(); i++)
        {
            if(Integer.parseInt(String.valueOf(number.charAt(i))) == 1){
                posValNum++;
            }
        }
        System.out.println("number of 1's: " + posValNum);
    }

    public static String isPalindrone(String word)
    {
        String original, reverse = word;
        original = word;

        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            return "Entered string is a palindrome.";
        else
           return "Entered string is not a palindrome.";

    }
}
