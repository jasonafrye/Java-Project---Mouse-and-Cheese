import becker.robots.*;

public class RatBait extends Thing
implements Runnable
{
public static boolean gotCheese = false;

public RatBait(City aCity, int aStreet, int anAvenue)
{super(aCity, aStreet, anAvenue);



}

public void run()
{
while(gotCheese == false)
{
this.setIcon(new CheeseIcon());
}
this.setIcon(new BlankIcon());


}
}//end class
