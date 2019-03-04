package os_project_phase1_part1;

import java.io.*;
import java.util.Scanner;

public class Loader {
    
    public Loader() {
        /*
        try {
            File f = new File("src\\os_project_phase1_part1\\ProgramFile-TextVersion.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                System.out.println(sc);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        }
        */
    }
    
    public void load() {
        
        try {
            File f = new File("src\\os_project_phase1_part1\\ProgramFile-TextVersion.txt");
            Scanner sc = new Scanner(f);
            PCB pcb = new PCB();
            
            while (sc.hasNext()) {
                pcb.extract(sc.nextLine());
                
                // System.out.println(sc.nextLine());
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("error");
        }
        
    }
    
}
