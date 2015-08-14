/**
 * Created by leo on 15/8/12.
 */
public class JaveBasic {
    public static void main(String[] args) {

        byte byteVariable;  //变量声明
        byteVariable = 8;

        short shortVariable = 32767; //-32768 ~ 32767

        int intVariable = 327678888;

        long longVariable = 3276999999999999999l;

        float floatVariable = 1200.0009f;

        double doubleVarible = 1999990.099999824;

        char charVarible ='p';

        boolean booleanVariable = true;

        String a = "hello world";
        System.out.println(byteVariable);
        System.out.println(shortVariable);
        System.out.println(intVariable);
        System.out.println(longVariable);
        System.out.println(floatVariable);
        System.out.println(doubleVarible);
        System.out.println(charVarible);
        System.out.println(booleanVariable);

        byte m = (byte)(byteVariable + (byte)intVariable);
        byte n = (byte)m;
        System.out.println(byteVariable + "+" + intVariable + "=" + m);
        System.out.println(n);

        int vara = 6;
        int varb= 6;
        System.out.println(vara++ + ++varb);
        System.out.println(vara);
        System.out.println(vara++ + ++varb);

        boolean booleanA = false;
        boolean booleanB = true;

        System.out.println(booleanA && booleanB);

        int intA = 10;
        System.out.println(intA<<2);
        int intB = 0110;
        System.out.println(intB);
    }
}
