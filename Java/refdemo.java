import java.util.LinkedList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class refdemo {
    public static void main(String args[]){//String is Immutable whenever we change it generates new string
        Date date= new Date();
        BigDecimal bl=new BigDecimal("76678789.777777");
        BigInteger b1= new BigInteger("5667908765798675687668798675576879986785756867");//uses log,int in small parts as linked list used 
        BigInteger p= new BigInteger("6758976555678757687976458976564776878976");
        //BigInteger b3=b1+b2;
        BigInteger b3=b1.add(p);
        //String Literal
        StringBuilder sb=new StringBuilder();//less synchronized than buffer properties are same as buffer
        //StringBuffer sb=new StringBuffer();
        sb.ensureCapacity(1000);//used to allot minimum capacity for string buffer
        System.out.println(sb.capacity());
        System.out.println(sb.length());//StringBuffer(if length>capacity then old capacity*2+2),it is used to make string mutable
        sb.append("fgbtvbtjbvjtkvktbvjkbjkvbk");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        String d="Arsh";
        d="Mradul";// Re-reference
        String no ="abcd";
        no= null; //make it null
        //Out of Scope
        if(10>2){
        String sql= "select * for employee";
        sql=sql+"where brand in('Apple' , 'Nokia')";
        }
        String name="Arsh";
        for(int i=1; i<=100000;i++){
            name = name+i;
        }
        {
        String n="Arsh".intern();
        String n2="Arsh";
        String n3= new String("Amit").intern();
        System.out.println(n==n2);
        System.out.println(n==n3);
        n = "Mradul";
        LinkedList<Integer> l= new LinkedList<>();
        char g2='A';
        Character.isAlphabetic(g2);
        int x=10;
        byte h=20;
        x=h;
        byte f=(byte)x;
        Integer y=20;
        //byte j=y.bytevalue();//conversion functions
        //long n=y.longvalue();//xxxValue
        String g="1000";
        int b2= Integer.parseInt(g);
        }
        
    }
}
// Jvm generate one heap and stack for the particular program, if we want a new
// heap then we have to generate new program.
