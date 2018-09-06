import java.util.*;
class gcd{
public static void main(String agrs[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter n , y no");
int  n = sc.nextInt();
int y = sc.nextInt( );
int small,c=0;
small = (n>y)? n:y;
for(int i=1;i<= small;i++)
{
if(n%i==0&&y%i==0)
{
      c=i;
} }
System.out.println(c);
}
}

