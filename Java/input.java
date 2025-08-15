import java.util.*;;

public class input {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = sc.nextInt();
        System.out.println("Enter the name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("id" + id + "name" + name);
        sc.close();
        // int word=0;
        // Scanner sc=new Scanner(new File(null));
        // Scanner sc= new Scannner(System.in)
        // while(Scanner.hasNext()){
        // word++;
        // System.out.println(scanner.next());
        // }
        // System.out.println(word);
        // sc.close();
    }
    //catch Exception e{} used so that code doest not get last during any type of problm
}
