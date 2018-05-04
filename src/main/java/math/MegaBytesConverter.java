package math;

public class MegaBytesConverter {

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(1025);
  }
  
  public static void printMegaBytesAndKiloBytes(int kiloBytes){
    int oneMegaByte = 1024;
    int remainingKiloBytes = kiloBytes % oneMegaByte;
    int megaBytes = (kiloBytes - remainingKiloBytes) / oneMegaByte;
    
    if(kiloBytes < 0){
        System.out.println("Invalid Value");
    } else {
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}
  
}
