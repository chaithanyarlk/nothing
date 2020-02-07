import java.util.Scanner;

class Bub{
     private int []arr;

     public Bub (){
          System.out.println("enter the values");
          int n;
          Scanner s= new Scanner (System.in);
          n=s.nextInt();
          arr=new int[n];
          for(int i=0;i<n;i++){
               arr[i]=s.nextInt();
          }
     }

     public void bubleSort(){
          int i,j;
          for(i=0;i<arr.length;i++){
               for(j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }
               }
          }
     }

     public void display (){
          for(int i=0;i<arr.length;i++)
          System.out.println(arr[i]);
     }


}

public class Bublesort {
     static public void main (String []args){
          Bub obj= new Bub();
          obj.display();
          obj.bubleSort();
          obj.display();
     }
}