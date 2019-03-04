package os_project_phase1_part1;

import java.util.ArrayList;

/*
 * Memory calls:
 * Disk
 */
public class Memory {
    
    public Memory() {}
    
    ArrayList<String> al = new ArrayList<String>();
    
    public void insert(String line) {
        al.add(line);
        //System.out.println(line);        
    }
}
