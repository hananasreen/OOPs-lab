import java.io.*;
import java.util.*;
class Employee{
int eNo;
String eName;
double eSalary;
Employee(int eNo,String eName,double eSalary){
this.eNo=eNo;
this.eName=eName;
this.eSalary=eSalary;
}
}
class empl
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n:");
int n=sc.nextInt();
Employee[] emp=new Employee[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter eNo:");
int eNo=sc.nextInt();
sc.nextLine();
System.out.println("Enter eName:");
String eName=sc.nextLine();
System.out.println("Enter eSalary:");
double eSalary=sc.nextDouble();
emp[i]=new Employee(eNo,eName,eSalary);
}
System.out.println("Enter a search value:");
int s=sc.nextInt();
for(int i=0;i<n;i++)
{
if(emp[i].eNo==s)
{
System.out.println("eNo is : "+emp[i].eNo+ "\t eName is : "+emp[i].eName+" \teSalary is: "+emp[i].eSalary);
}
}
}
}


