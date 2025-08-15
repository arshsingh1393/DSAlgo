//class-Blueprint(Features)/Template/PLan\
//object-state
//className-PascalCase
//e.g SavingAccount
//e.g Noun
//Alphabet start,Alphanumeric,_,$
// Statically type lang. bcz we have to define every type of vaariable we are using in the arguments
class Adder {
    public static void main() {
        System.out.println("I AM THE MAIN");
    }
}

public class First { // Command is used for Automation, We can Generate command by passing any thing
                     // in terminal//
    static public void main(String... args) {
        boolean att = true;
        char agree = '0';
        System.out.println(agree);
        int e = 100;// int Literal
        long tt = 999L;
        float h = 99.22f;
        double a = 234.1;
        final double PI = 3.14;
        main(args);// Static is used for Eagle class load,public is used for JRE data bhr na
                   // jaaye//
        var sum = 0;
        // int sum=0;
        for (String i : args) { // writing another way of loop enhanced version
            // for(int i=0;i<args.length;i++){
            // sum=sum+Integer.parseInt(args[i]);
            sum = sum + Integer.parseInt(i);
        }
        System.out.println(sum);
        System.out.println(agree);
    }
}
// Datatypes
// 1- Primitive(value types)
// a)Non-decimal- byte(1),short(2),int(4),long(8)
// b)Decimal- float(4),double(8)
// c)char(2) unicode1/2 byte
// d)boolean-T/F
// 2- Non-Primitive Datatypes
