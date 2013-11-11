package Chapter3.PB3_4;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_4 {

    public static void main(String[] args) {
        // Set up code.
        int n = 5;
        HanoiTower[] towers = new HanoiTower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new HanoiTower(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            towers[0].addDisk(i);
        }

        // Copy and paste output into a .XML file and open it with internet explorer.
        //towers[0].print();
        towers[0].moveDisks(n, towers[2], towers[1]);
        //towers[2].print();
    }
}
