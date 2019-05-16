import java.util.ArrayList;

public class Computer {
	public ArrayList<Component> Components=new ArrayList<Component>();
	public void addItem(Component C){
		Components.add(C);
	   }

	   public float getCost(){
	      float cost = 0.0f;
	      
	      for (Component C : Components) {
	         cost += C.price();
	      }		
	      return cost;
	   }

	   public void showItems(){
	   
		   for (Component C : Components) {
	         System.out.print( C.name()+" -> " );
	         System.out.print("Speed : " + C.speed());
	         System.out.println(", Price : " + C.price()+"$");
	      }		
	   }	

}
