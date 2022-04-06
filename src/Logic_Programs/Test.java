package Logic_Programs;

public class Test {

	static int threadNumber=1;
	static String lock="lock";

	public static void main(String[] args) {

		new Thread(()->
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
						System.out.println(i);		
						threadNumber=2;
						lock.notifyAll();
					}
				}}
		}).start();
		new Thread(()->
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
						System.out.println(i);		
						threadNumber=1;
						lock.notifyAll();
					}
				}
			}
		}).start();
	}
}