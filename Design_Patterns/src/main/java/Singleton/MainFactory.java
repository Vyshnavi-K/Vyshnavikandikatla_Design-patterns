package Singleton;

public class MainFactory 
{
	public static void main(String[] args) 
	{
		SmartWorker sw = new SmartWorker();
		Factory m = new Factory(sw);
		m.ManageWork();
		
		LazyWorker lw = new LazyWorker();
		Factory m2 = new Factory(lw);
		m2.ManageWork();
		
		ExtraordinaryWorker ew = new ExtraordinaryWorker();
		Factory m3 = new Factory(ew);
		m3.ManageWork();

	}
}
