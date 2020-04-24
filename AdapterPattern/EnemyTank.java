
import java.util.*;

/**
 * 
 */
public class EnemyTank implements EnemyAttacker{

    /**
     * Default constructor
     */
	Random generator = new Random();
    public EnemyTank() {
    }

    /**
     * @return
     */
    public void fireWeapon() {
int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    /**
     * @param String 
     * @return
     */
    public void assignDriver(String driverName) {
        // TODO implement here
    	System.out.println(driverName + " is driving the tank");
    }

    /**
     * @return
     */
    public void driveForward() {
        // TODO implement here
int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Tank moves " + movement + " spaces");
    }

}