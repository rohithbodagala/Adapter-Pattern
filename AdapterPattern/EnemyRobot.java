
import java.util.*;

/**
 * 
 */
public class EnemyRobot {

    /**
     * Default constructor
     */
	Random generator = new Random();
    public EnemyRobot() {
    }

    /**
     * @return
     */
    public void smashWithHands() {
        // TODO implement here
int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");
    }

    /**
     * @return
     */
    public void walkForward() {
        // TODO implement here
int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    /**
     * @param String 
     * @return
     */
    public void reactToHuman(String driverName) {
        // TODO implement here
    	System.out.println("Enemy Robot Tramps on " + driverName);
    }

}