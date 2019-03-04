package os_project_phase1_part1;

import java.util.ArrayList;

public class PCB {
    
    ArrayList<String> al = new ArrayList<String>();
    Memory RAM = new Memory();
    
    public PCB() {
    }
    
    public void extract(String line) {
        al.add(line);
        RAM.insert(line);
    }
    
}
