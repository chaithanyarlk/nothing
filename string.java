import java.util.Scanner;





class Fibanocii{
     private int val;

     public Fibanocii(int data){
          val=data;
          System.out.println("parametersied constructor has been called");
     }
     public void fibRecur(int b,int c,int k){
          if(b==1 && c==0 &&k==0){
               System.out.println("1");
               fibRecur(b, c,1);
          }

          if(val!= 1){
               b=b+c;
               c=b-c;
               System.out.println(b);
               val--;
               fibRecur(b, c,1);
          }

     }
     public void fibCal(){
          int b,c;
          b=1;c=0;
          System.out.println("1"+" this is at index 0");
          for( int i=1;i<val;i++){
               b=b+c;
               c=b-c;
               System.out.println(b+"this is st index "+i);

          }
     }
}

public class string{
     static public void main(String []args){
          int a,b,c;
          Scanner s= new Scanner(System.in);
          System.out.println("please enter the number to get the fibbanocci");
          a=s.nextInt();

          Fibanocii obj=new Fibanocii(a);
          obj.fibCal();
          obj.fibRecur(1, 0,0);
          
          
               System.out.println("1 "+" this the value of fibannoci at 0 index");
         
          {
               b=1;
               c=0;
               for(int i=1;i<a;i++){
                    b=b+c;
                    c=b-c;
                    System.out.println(b+" this the value of fibannoci at "+i+" index");

               }
               
          }
          System.out.println("thanks");

     }
}