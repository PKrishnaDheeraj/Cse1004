import java.util.*;
public class Veghotel1
{public static void main(String []arsg)
 {Scanner in=new Scanner(System.in);
 	int a,b,c=0,c1=0;
 	int d[]={30,35,40,45,30,100,125,150,175,25,30,20,10,20,0,10};
 	int r,x=0,s=0,z=1;
 	 String a4[]={"Idly","Vada","Dosa","Poori","Bonda","NorthIndian","SouthIndian","Chinese","Italian","ChilledCoffee","Juice","Tea","Milk"};
while(z==1){
 	System.out.println("Choose the type of food or drink you want:");
 	System.out.println("1.Breakfast\n2.Lunch\n3.Dinner\n4.Snacks\n5.Beverages");
 	a=in.nextInt();
 	if(a>5)
 		{System.out.println("Invalid Input");}
 	if(a==1)
 	{
 		System.out.println("Choose from below:");
 		    System.out.println("1.Idly-4\n2.Vada-4\n3.Dosa-1\n4.Poori-2\n5.Bonda-4");
 			b=in.nextInt();
 			x=b-1;
 			if(b>5)
 				{System.out.println("Invalid input");}
 			c=d[x];
 			s=in.nextInt();
 			c1=c*s;
 		}
 	
 		if(a==2 || a==3)
 	{
 		System.out.println("Choose from below:");
             System.out.println("6.North Indian\n7.South Indian\n8.Chinese\n9.Italian");
 			 b=in.nextInt();
             x=b-1;
 			if(b<5 || b>9)
 				{System.out.println("Invalid input");}
 			c=d[x];
 			s=in.nextInt();
 			c1=c*s;
 		}
 		if(a==4){
 		System.out.println("Choose from below:");
 		    System.out.println("10.MirchiBhajji\n11.Bonda\n12.Samosa\n13.Kachori");
 			b=in.nextInt();
 			x=b-1;
 			if(b>13 || b<10)
 				{System.out.println("Invalid input");}
 			c=d[x];
 			s=in.nextInt();
 			c1=c*s;
 	}	
 			          if(a==5)
 	{
 		System.out.println("Choose from below:");
 		    System.out.println("14.Chilled Coffee\n15.Juice\n16.Tea\n17.Milk");
 			b=in.nextInt();
             x=b-1;
 			if(b<14 || b>17)
 				{System.out.println("Invalid input");}
 			if(b==15)
 			{   
 				System.out.println("Enter the juice you want");
 				String ji[]={"Lemon","Orange","Mango"};
 				int ci[]={10,12,15};
 		       System.out.println("1.Lemon\n2.Orange\n3.Mango");
 		       r=in.nextInt();r=r-1;
 		       if(r>3)
 					{System.out.println("Invalid input");}
 				System.out.println("Enter the quantity:");
 				c=in.nextInt();
 				c1=ci[r]*c;
 			}
 			if(b==17)
 			{   
 				System.out.println("Enter which milk you want");
 				String ji[]={"Plain","Horlicks","Boost"};
 				int ci[]={10,12,15};
 		       System.out.println("1.Plain\n2.Horlicks\n3.Boost");
 		       r=in.nextInt();r=r-1;
 		       if(r>3)
 					{System.out.println("Invalid input");}
 				System.out.println("Enter the quantity:");
 				c=in.nextInt();
 				c1=ci[r]*c;
 			}

 			else {c=d[x];
 			s=in.nextInt();
 			c1=c*s;}
 	}
 	  System.out.print("\t1.Place another order\n\t2.End");
    z=in.nextInt();
 }
 System.out.print("Enter Name : ");in.nextLine();
 	String name=in.nextLine();
 	System.out.print("Enter Mobile No.: ");
 	long mb=in.nextLong();
 	in.nextLine();
 	System.out.print("Enter your address : \n\t");
 	String a1=in.nextLine();
 	System.out.print("\t");
 	String a2=in.nextLine();
 	System.out.print("\t"); 
 	String a3=in.nextLine();
 System.out.println("\t\tYour order is Succesfully Placed and will be delivered in one hour.");
 System.out.println("\t\tOrder Summary : \n\t\t----------------");
 System.out.println("\t\tTotal Cost : " +c1 +"\n\t\tDelivery Address : \n\t\t-------------------\n"+"\t\t" +a1 +"\n\t\t" +a2 +"\n\t\t" +a3);

 }
}