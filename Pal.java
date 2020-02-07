import java.util.Scanner;
class Palin{
     private String a;

     public Palin(String a){
          this.a=a;
          System.out.println("parameterized constructor has been called");
     }
     public void checkPal(){
     int i;
          for( i=0;i<a.length()/2;i++){
               if(a.charAt(i)==a.charAt(a.length()-i-1))
               break;

          }
          if(i==(a.length()/2)+1){
               System.out.println("yes");
          }
          else{
               System.out.println("no");
          }}

}

public class Pal{
     static public void main(String []args){
          String a;
          Scanner s=new Scanner(System.in);
          a=s.nextLine();
          Palin obj =new Palin(a);
          obj.checkPal();

          int i;
          for( i=0;i<a.length()/2;i++){
               if(a.charAt(i)==a.charAt(a.length()-i-1))
               break;

          }
          if(i==(a.length()/2)+1){
               System.out.println("yes");
          }
          else{
               System.out.println("no");
          }

     }
}

