 public class Mythread
{
public static void main(String args[])
{
Runnable r=new Runnable1();
Thread t=new Thread();
t.start();
Runnable r2=new Runnable2();
Thread t2=new Thread(r2);
t2.start();
    }
 }
class Runnable2 implement Runnable
{
public void run()
{
for(int i=0;i<21;i++)
{
if(i%2==1)
System.out.println("Odd No."+i);
     }
  }
}