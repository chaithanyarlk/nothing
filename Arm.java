import java.util.Scanner;

class Armst{
     private int a;
     public Armst(int a){
          this.a=a;
     }
     public void check(){
          int b=a;

          int sum=0;
          while(b!=0){
               sum=sum+((b%10)*(b%10)*(b%10));
               b=b/10;

          }
          if(sum==a){
               System.out.println("yes");
          }
          else{
               System.out.println("no");
          }
     }
}

public class Arm{
     static public void main(String []args){
          Armst obj;
          Scanner s= new Scanner(System.in);
          obj=new Armst(s.nextInt());
          obj.check();
          
     }
}