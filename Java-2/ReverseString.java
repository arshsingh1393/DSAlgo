public class ReverseString {
    static String reverse(String str) {
        // if(str==" ")
        if (str.equals("")) {
            return "";
        }
        // String result = reverse(str.substring(1));
        // return result+str.charAt(0;)
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Arsh";
        System.out.println(str.charAt(2)); // chart at is used for positioin like index in an array
        System.out.println(str.substring(1, 3));
        // used for taking substring in the string but it always take the -1 number from
        // the end whenver we apply this case
        System.out.println(reverse(str));
    }

}
