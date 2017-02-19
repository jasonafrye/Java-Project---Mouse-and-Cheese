import becker.robots.*;

public class MouseBot extends RobotSE
implements Runnable

{

public MouseBot(City aCity, int aStreet, int anAvenue, Direction aDirection)
{super(aCity, aStreet, anAvenue, aDirection);
this.setIcon(new MouseIcon());
}//end constructor

public void run()
{
this.followRightWall();
}

public void followRightWall()
{
while (this.canPickThing() == false)
	{
	 if (this.rightIsBlocked())
		{
		 if (this.frontIsBlocked())
			{
			this.turnLeft();
			}
		else
			{
			 this.move();
			}
		}
	else
		{
		this.turnRight();
		this.move();
		}
	}
this.pickThing();
this.turnNorth();
}

public boolean rightIsBlocked()
{this.turnRight();
boolean blocked = this.frontIsBlocked();
this.turnLeft();
return blocked;
}

public boolean frontIsBlocked()
{

 boolean blocked = !this.frontIsClear();
 return blocked;
}

public void turnNorth()
{
while (this.getDirection() != Direction.NORTH)
this.turnLeft();
}

public void turnLeft()
{
this.setSpeed(200);
super.turnLeft();
this.setSpeed(2);
}

public void pickThing()
{
RatBait.gotCheese = true;

}


public void turnRight()
{
this.setSpeed(200);
super.turnRight();
this.setSpeed(2);
}

}//end class

