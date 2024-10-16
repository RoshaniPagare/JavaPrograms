package Sept.Ex_11092024_primitiveDataTypes_Numeric;
//primitive Datatype--> Boolean DataType
public class Lab011_Rules_for_defining_variables {
    public static void main(String[] args) {
        //identifier(Variables) can contain alphabets, digits and 2 special symbols i.e $(dollar) and _(underscore)
        // Variable names can't be start with number
        //variables name can start with $ and _
        //First character of variable must be an alphabets or $ or _
        //we cannot use reserved words or keywords as identifier(variables)
        //space is not allowed in variable name

        //these are not valid variable name
        /*boolean 123= true;
        boolean 123ABC= true;
        boolean Roshani Pagare= true;*/

        //these are valid variables names
        boolean $= true;
        boolean _ = false;
        boolean ABC123= true;
        boolean abc_123_xyz= true;
        boolean My_Name_is_Roshani_Rajendra_pagare= true;
       boolean _123= true;
       boolean $abc= true;
        System.out.println(_123);
        System.out.println();

        }
}
