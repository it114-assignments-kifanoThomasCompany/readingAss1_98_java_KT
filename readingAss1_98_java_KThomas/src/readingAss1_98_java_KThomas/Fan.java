package readingAss1_98_java_KThomas;

public class Fan 
{
	int SLOW = 1;
	int MEDIUM = 2;
	int FAST = 3;
	private int speed = SLOW;
	private boolean on;
	private double radius;
	String color;
	
	Fan()
	{		
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	public int getSpeed()
	{ 
		return speed;
	}
	
	public boolean isOn()
	{
		return on;
		
	}
	
	public double getRadius()
	{
		return radius;
		
	}
	public String getColor()
	{
		return color;		
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;

	}
	public void setOn(boolean on)
	{
		this.on = on;	
	}
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	public void setColor(String color)
	{
		this.color = color;
	}	
	public String toString()
	{
		if(isOn())
		{
			return "Speed = " + getSpeed() + "  " + "Color = " + getColor() + "  " + "Radius = " + getRadius();
		}
		else {
			return "Color = " + getColor() + " " +	"Radius = " + getRadius() + "  " + "Fan is off";
		}
	}
}
