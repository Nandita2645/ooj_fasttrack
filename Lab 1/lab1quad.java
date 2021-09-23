import java.util.*;
import java.lang.*;

class lab1quad
{
      public static void main(String[]args)
      {
              double a,b,c,r1=0,r2=0;
              System.out.println("Enter the values: ");
              Scanner s=new Scanner(System.in);
              a=s.nextFloat();
              b=s.nextFloat();
              c=s.nextFloat();
              double d=(b*b)-(4*a*c);
              if(d==0)
              {
                System.out.println("two equal and real roots");
                r1=-b/2*a;
                r2=r1;
              }
              else if(d>0)
              {
                System.out.println("two distict real  roots");
                r1=-b+Math.sqrt(d)/2*a;
                r2=-b+Math.sqrt(d)/2*a;
              }
              else
              {
                 System.out.println("no real roots");
                 System.exit(0);
              }
 System.out.println("the roots of quadratic equation are r1="+r1+" and r2="+r2);
      }
}
