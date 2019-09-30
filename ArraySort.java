import java.util.Scanner;
class ArraySort
  {
     public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
  	  int a[]=new int[50];
	  int i,j,temp;
	  System.out.println("Enter the no. of elements:");
  	  int n=sc.nextInt();

	  System.out.println("Enter the elements");
          for(i=0;i<n;i++)
	 {
            a[i]=sc.nextInt();
	  }

	  for(i=0;i<n;i++)
	    {
	       for(j=0;j<n-1;j++)
  		 {
 		    if(a[j]>a[j+1])
		      {
		         temp=a[j];
			 a[j]=a[j+1];
			 a[j+1]=temp;
		      }
		 }      
	    }
          System.out.println("Sorted array:");
          for(i=0;i<n;i++)    
            System.out.println(a[i]+" ");
       }
  }	
	       	
