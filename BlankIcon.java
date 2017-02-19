import becker.robots.icons.*;
import java.awt.*;

public class BlankIcon extends Icon
{
	public BlankIcon()
	{ super();
	}

	public void paintIcon(Graphics g)
	{
	//draw body
	Color stcolr = new Color(211,211,211);
	g.setColor(stcolr);
	g.fillRect(20,35,50,27);
	}


}