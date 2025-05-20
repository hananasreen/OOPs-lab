//create a graphics package that has classes and interfaces for figures rectangle,triangle,square and circle.test the package by finding the area of these figures.
package graphics;
import java.io.*;
import java.util.*;
interface shape
{
double area();
}
class rectangle implements shape
{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter length and breadth:");
float l=sc.nextFloat();
float b=sc.nextFloat();
double result=l*b;
return result;
}
}
class square implements shape{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Side:");
float s=sc.nextFloat();
double result=s*s;
return result;
}
}

class triangle implements shape{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Base and Height:");
float ba=sc.nextFloat();
float he=sc.nextFloat();
double result=0.5*ba*he;
return result;
}
}
class circle implements shape
{
Scanner sc=new Scanner(System.in);
public double area()
{
System.out.println("Enter Radius:");
float r=sc.nextFloat();
double result=Math.PI*r*r;
return result;
}
}
class pac
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Choice: 1.Rectangle, 2.Square, 3.Triangle, 4.Circle");
int ch=sc.nextInt();
switch(ch)
{
case 1:
rectangle re=new rectangle();
System.out.println("Area of Rectangle="+re.area());
break;
case 2:
square sq=new square();
System.out.println("Area of Square="+sq.area());
break;
case 3:
triangle tr=new triangle();
System.out.println("Area of Triangle="+tr.area());
break;
case 4:
circle cr=new circle();
System.out.println("Area of Circle="+cr.area());
break;
default:
System.out.println("Invalid Choice!!!");
}
}
}
