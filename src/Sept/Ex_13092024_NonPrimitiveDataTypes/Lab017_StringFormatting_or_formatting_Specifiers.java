package Sept.Ex_13092024_NonPrimitiveDataTypes;

import java.sql.SQLOutput;

public class Lab017_StringFormatting_or_formatting_Specifiers {
    public static void main(String[] args) {
        //String Formatting or formatting Specifiers
        //1- %d = It is used for int, Byte, short, long
        //2- %s= It is used for String types of Variables
        //3- %c= It is used for char types of variables
        //4- %f= it is used for float and double

        int num= 2;
        //printf used for printing statement in formatted form it is used with formatting specifiers
        System.out.printf("Value of num is %d",num);
        System.out.println();
        System.out.printf("%d*1=%d",num,num*1);
        System.out.println();
        System.out.printf("%d*%d=%d",num,2,num*2);


    }
}
