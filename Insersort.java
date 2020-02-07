class Insert{
     private int arr[];
     public Insert (){
          System.out.println("enter the values");
          int n;
          Scanner s= new Scanner (System.in);
          n=s.nextInt();
          arr=new int[n];
          for(int i=0;i<n;i++){
               arr[i]=s.nextInt();
          }
     }
     public void insertionSort(){
          int i,key,j;
          for(i=1;i<arr.length;i++){
               key=arr[i];
               j=i-1;
               while(j>=0&& arr[j]>key){
                    arr[j+1]=arr[j];
                    j=j-1;
               }
               arr[j+1]=key;
          }
     }
     public void display (){
          for(int i=0;i<arr.length;i++)
          System.out.println(arr[i]);
     }
}

public class Insertsort{
     static public void main(String []args){
          Insert obj=new Insert();
          obj.display();
          obj.insertionSort();
          obj.display();
     }
}