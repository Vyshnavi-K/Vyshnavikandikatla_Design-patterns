package Singleton;

public class Factory 
{
	Worker worker;           
	public Factory(Worker worker)   // constructor passing object as reference
	{

		this.worker=worker;
		
	}
	public void ManageWork() 
	{	
		
		this.worker.work();  //using single object as reference and call child classes 
	}

}

interface Worker      //Loose Coupling
{
	void work();
	
}

class SmartWorker implements Worker
{
	public void work() 
	{
		System.out.println("smart worker working");
	}

}

class LazyWorker implements Worker 
{
	public void work() 
	{
		System.out.println("Lazy worker working");
	}

}

class ExtraordinaryWorker implements Worker
{
	public void work()
	{
		System.out.println("ExtraOrdinary worker working");
	}
}