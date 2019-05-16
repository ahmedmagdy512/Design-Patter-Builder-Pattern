
public class ComputerBuilder {
	public Computer GamingComputer()
	{
		Computer c=new Computer();
		c.addItem(new AMD());
		c.addItem(new Ram8Gb());
		c.addItem(new HighEndProcessor());
		c.addItem(new MsiBoard());
		
		return c;
	}
	public Computer OfficeComputer()
	{
		Computer c=new Computer();
		c.addItem(new Nvidia());
		c.addItem(new Ram2Gb());
		c.addItem(new MidEndProcessor());
		c.addItem(new GigaByteBoard());
		return c;
	}

}
