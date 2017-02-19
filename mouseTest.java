import becker.robots.*;

public class mouseTest
{

public static void main(String[] args)
{
MazeCity lab = new MazeCity(10,10,1,1);
MouseBot labRat = new MouseBot(lab, 0, 0, Direction.EAST);
RatBait cheese = new RatBait(lab, 5,5);

Thread runMaze = new Thread(labRat);
Thread colorcheese = new Thread(cheese);
runMaze.start();
colorcheese.start();


}

}
