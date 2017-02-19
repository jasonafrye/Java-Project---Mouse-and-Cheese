import becker.robots.icons.*;
import java.awt.*;

public class CheeseIcon extends Icon
{
	public CheeseIcon()
	{ super();
	}

	public void paintIcon(Graphics g)
	{
//draw body
g.setColor(Color.YELLOW);
g.fillRect(20,35,50,27);

//draw holes
g.setColor(Color.BLACK);
g.fillOval(20,40,20,15);
g.fillOval(50,40,10,10);


}

}