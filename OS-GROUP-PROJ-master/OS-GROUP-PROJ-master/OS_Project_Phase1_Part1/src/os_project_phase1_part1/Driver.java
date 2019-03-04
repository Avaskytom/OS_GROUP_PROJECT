/*
 * This is the core component of the whole system.
 * 
 */
package os_project_phase1_part1;

/*
 * Driver calls:
 * Loader
 * Long Scheduler
 * Short Scheduler
 */
public class Driver {
    
    public Driver() {
        Loader loader = new Loader();
        loader.load();
        /*
        while (true) {
            scheduler();
            dispatcher();
            CPU();
            waitforinterrupt();
        }
        */
    }
        
}
