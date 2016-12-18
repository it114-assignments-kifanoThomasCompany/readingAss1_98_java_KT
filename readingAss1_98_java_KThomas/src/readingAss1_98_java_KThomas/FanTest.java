package readingAss1_98_java_KThomas;

public class FanTest {

	public static void main(String[] args)	
	{
		// TODO Auto-generated method stub	
			Fan fan1 = new Fan();
			Fan fan2 = new Fan();
			Fan ceilingfan = new Fan();
			
			int SLOW = 1;
			int MEDIUM = 2;
			int FAST = 3;
			
			fan1.setSpeed(FAST);
			fan1.setRadius(10.0);
			fan1.setColor("Silver");
			fan1.setOn(true);
			
			fan2.setSpeed(MEDIUM);
			fan2.setRadius(5.0);
			fan2.setColor("Red");
			fan2.setOn(false);
			
			ceilingfan.setSpeed(SLOW);
			ceilingfan.setRadius(20.0);
			ceilingfan.setColor("Brown");
			ceilingfan.setOn(true);
			
			System.out.println("Fan 1: " + fan1.toString());
			
			System.out.println("Fan 2: " + fan2.toString()); 
			
			System.out.println("Fan 3: " + ceilingfan.toString());
	}

}
