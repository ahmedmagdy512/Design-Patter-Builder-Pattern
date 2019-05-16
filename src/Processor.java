
public abstract class Processor implements Component{

	@Override
	public String name() 
	{
		return "Processor";
	}

	public abstract float price() ;
	public abstract String speed();
	
	

}
