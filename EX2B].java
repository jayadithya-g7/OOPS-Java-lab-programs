
import java.util.Scanner; public class interest{
public static void main(String[] args){
 
float p; float rate; int t;
float monthlypay; float monthlyrate; float totalint=0; float tmp;
 
Scanner scan=new Scanner(System.in); System.out.print("enter principal:"); p=scan.nextFloat();
tmp=p;
System.out.print("enter rate of interest:"); rate=scan.nextFloat();
 
System.out.print("enter time period:"); t=scan.nextInt();
 
System.out.print("enter monthlypay:"); monthlypay=scan.nextFloat();
 
System.out.println("PAYMENT# INTEREST PRINCIPAL BALANCE");
for(int i=1;i<t*12+1;i++){
 
System.out.print(i+" "); monthlyrate=rate/12; float monthlyinterest;
monthlyinterest=(monthlyrate/100)*p; totalint+=monthlyinterest;

System.out.print(monthlyinterest+" "); float prin;
prin=monthlypay-monthlyinterest; System.out.print(prin+" ");
float balance;
 
if(p<monthlypay){ p=0;
balance=0;
}
else{
balance=p-monthlypay;
 
p=balance;
}
System.out.print(balance+"\n");
 
 
 
}
float total=tmp+totalint; System.out.println("total payment:"+total);
 
 
 
 
 
 
 
 
 
}
}
