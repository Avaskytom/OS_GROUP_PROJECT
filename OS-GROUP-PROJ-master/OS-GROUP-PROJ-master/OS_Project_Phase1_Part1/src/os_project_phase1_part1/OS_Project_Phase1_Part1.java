/*
 * @authors:
 * Olivier Tran
 * Joe Eberly
 * Richard Bioh
 * Wesley Addo
 */
package os_project_phase1_part1;

import java.math.BigInteger;

public class OS_Project_Phase1_Part1 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        
        String instruction = "0xC050005C";
        System.out.println("Instruction: " + instruction + "\n");
        
        String hex = getHex(instruction);
        System.out.println("Hexadecimal: " + hex + "\n");
        
        String bin = hexToBin(hex);
        System.out.println("Binary: " + bin);
        System.out.println("2 bits: " + bin.substring(0, 2));
        
        System.out.println("OPCODE: " + bin.substring(2, 8));
        System.out.println("OPCODE Instruction type: " );
        
        System.out.println("Reg 1: " + bin.substring(8, 12));
        System.out.println("Reg 2: " + bin.substring(12, 16));
        System.out.println("Address: " + bin.substring(16));
        
    }
    
    public static String getHex(String instruction) {
        return instruction.substring(2);
    }
    
    public static String hexToBin(String hex) {
        return new BigInteger(hex, 16).toString(2);
    }
    
    public static String binToDec(String bin) {
        int dec = Integer.parseInt(bin, 2);
        return dec.toString(2);
    }
}
