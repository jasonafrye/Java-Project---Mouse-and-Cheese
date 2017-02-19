import becker.robots.icons.*;
import java.awt.*;

public class MouseIcon extends Icon
{
	public MouseIcon()
	{ super();
	}

	public void paintIcon(Graphics g)
	{
	//draw body
	g.setColor(Color.WHITE);
	g.fillRoundRect(37,17,30,50,10,10);

	//draw ears
	g.fillOval(30,10,15,15);
	g.fillOval(60,10,15,15);
	g.setColor(Color.PINK);
	g.fillOval(32,11,12,12);
	g.fillOval(62,11,12,12);

	}




}
