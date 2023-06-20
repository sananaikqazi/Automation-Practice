package abstractDemo;

public class HRDept extends ITDept {

	public static void main(String[] args)
	{
		HRDept HR = new HRDept();
		HR.salary();
		HR.Bonus();
		HR.work();
		HR.goodies();
		
		ITDept it= new HRDept();
		it.salary();
		it.goodies();
		it.work();
	}

	
	public void salary()
	{
		System.out.println("5LPA");
	}
	
	public void Bonus()
	{
		System.out.println("1Lakh");
	}

}
