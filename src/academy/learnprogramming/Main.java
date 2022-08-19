package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.printIn("Byte Minimum Value" + myMinIntValue);
        System.out.printIn("Byte Maximum Value" + myMaxIntValue);

        byte myMinShortValue = Byte.MIN_VALUE;
        byte myMaxShortValue = Byte.MAX_VALUE;
        System.out.printIn("Byte Minimum Value" + myMinShortValue);
        System.out.printIn("Byte Maximum Value" + myMinShortValue);

        long myLongValue = 100L;

        byte myMinLongValue = Byte.MIN_VALUE;
        byte myMaxLongValue = Byte.MAX_VALUE;
        System.out.printIn("Byte Minimum Value" + myMinLongValue);
        System.out.printIn("Byte Maximum Value" + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647;
        System.out.printIn(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

    }
}
