
import java.util.*;

/**
 * 
 */


public class EnemyRobotAdapter implements EnemyAttacker{

    /**
     * Default constructor
     */
	private EnemyRobot theRobot;
	
    public EnemyRobotAdapter(EnemyRobot newRobot) {
    	theRobot = newRobot;
    }

    /**
     * 
     */
    



    /**
     * @return
     */
    public void fireWeapon() {
        // TODO implement here
    	theRobot.smashWithHands();

    }

    /**
     * @param String 
     * @return
     */
    public void assignDriver(String driverName) {
        // TODO implement here
    	theRobot.reactToHuman(driverName);
    }

    /**
     * @return
     */
    public void driveForward() {
        // TODO implement here
    	theRobot.walkForward();
    }

}