import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ex5{
public static void main(String[] args){
ArrayList<String> l=new ArrayList<>();
Scanner scan=new Scanner(System.in);
System.out.println("appending");
System.out.print("enter string:");
String val=scan.nextLine();
//appending
l.add(val);
System.out.println(l);
//inserting
System.out.println("inserting");
System.out.print("enter string to insert:");
val=scan.nextLine();
System.out.print("enter index:");
int i=scan.nextInt();
l.add(i,val);
System.out.println(l);
//search
System.out.println("searching");
System.out.print("enter string to search:");
val=scan.nextLine();
System.out.println(l.contains(val));
//startswith
System.out.println("startswith");
System.out.print("enter character:");
char c=scan.next().charAt(0);
for(String str:l){
if(str.charAt(0)==c){
System.out.println(str);
}
}
//sorting ascending
System.out.println("ascending");
Collections.sort(l);
System.out.println(l);
//descending
System.out.println("descending");
Collections.sort(l,Collections.reverseOrder());
System.out.println(l);
}
}
