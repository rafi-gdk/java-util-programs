package thread;

import java.util.Set;
import java.util.TreeSet;

class EvenOddPrintThread
{
	static int threadNumber=1;
	static String lock="lock";
	public void even()
	{
		synchronized (lock) {
			for(int i=0;i<10;i++)
			{
				if(i%2==0)
				{
					while(threadNumber!=1)
					{
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Even-"+i+" "+Thread.currentThread().getName());			
					threadNumber=2;
					lock.notifyAll();
				}
			}
		}
	}
	public void odd()
	{
		synchronized (lock) {
			for(int i=0;i<10;i++)
			{
				if(i%2!=0)
				{	
					while(threadNumber!=2)
					{
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Oddd-"+i+" "+Thread.currentThread().getName());	
					threadNumber=1;
					lock.notifyAll();
				}
			}
		}
	}
}

enum Name
{
	Alice,Smith,Bob,Jones
}

public class PrintingAlternative {
	public static void main(String[] args) {
		Set<Name> set=new TreeSet<>();
		set.add(Name.Alice);
		set.add(Name.Smith);
		set.add(Name.Bob);
		set.add(Name.Smith);
		
		System.out.println(set);
		int val=10;
		if((val>10?val++:--val)<10)
		{
			System.out.println("Mac");
		}
		if(val<10)
		{
			System.out.println("PC");
		}
		
	}
}