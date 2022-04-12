package course.operatorpkg;

import course.variablepkg.VariableSample;

public class OperatorSample {
    public void operatorsTest(){
        //int count = 10;
        //Integer count = new Integer(10);// no need to create object by using new keyworsd instesd of this we can use value of method
        //Integer count = Integer.valueOf(10);//wrapper class use explicitly
        Integer count = 10;//autoboxing automatically convet into integer wrapper class
        //int temp = count.intValue();// convert wrapper class into primitive datatypes but this is also not needed like
        // autoboxing java has a feature of auto unboxing just use
        int temp = count;
        int extraCount = 2;// count + extraCount output is 12 but
        //System.out.println("Total count is :: " + count + extraCount); //
        // output -Total count is :: 102
        // when we use (count + extraCount) then output is Total count is :: 12
        // integer + Integer = Integer
        // string +string = string
        // string + integer = string
        int totalCount = count;
        if(extraCount >= 2){
            totalCount = count + extraCount;// we use ternary operator instead of it
        }
        //totalCount = extraCount == 2 ? count + extraCount : count;

        System.out.println(totalCount);
        String s1 = new String("Java");
        String s2 = new String("Java");
        /*if(s1 == s2){
            System.out.println("both the strings are same");
        }else{
            System.out.println("both the strings are different");//print else statement bcz it check the reference of variable
            // which is different for both*/
        if(s1.equals(s2)){
            System.out.println("both the strings are same");// print both the strings are same

        }
    }

    public static void main(String[] args) {
        OperatorSample obj = new OperatorSample();
        obj.operatorsTest();
    }
}
