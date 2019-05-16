
public class BuilderPatternDemo {
	public static void main (String args[])
	{
		ComputerBuilder CBuilder=new ComputerBuilder();
		System.out.println("Gaming Computer : ");
		Computer C=CBuilder.GamingComputer();
		C.showItems();
		System.out.println("Office Computer : ");
		Computer C2=CBuilder.OfficeComputer();
		C2.showItems();
		
	}
}


