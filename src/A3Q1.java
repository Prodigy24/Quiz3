
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author coulh9904
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot defaultsteve = new Robot(Kitchener, 1, 1, Direction.EAST, 20); //Creates city, with the 20 things.
        while (defaultsteve.countThingsInBackpack() > 0) { //Creates the loop that will operate the code until Steve has planted all his 'seeds'.
            for (int x = 0; x < 5; x = x + 1) { //This essentially counts how many things are placed (I.e. how many times the two lines below are run), stopping at 5 'seeds' placed.
                defaultsteve.putThing();
                defaultsteve.move();
            }
            int x = 0; //Resets the above command to zero, so it may cout up to 5 again.
            if (defaultsteve.getDirection() == Direction.EAST) { //Different turn methods are required depending on the direction faced, this accounts for that and allows Steve to continue placing 'seeds'.
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
                defaultsteve.move();
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
                defaultsteve.move();
            } else { //Account for other direction.
                defaultsteve.turnLeft();
                defaultsteve.move();
                defaultsteve.turnLeft();
                defaultsteve.move(); 
            }
        }
    }
}
