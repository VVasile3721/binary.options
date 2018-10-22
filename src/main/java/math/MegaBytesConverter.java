package math;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MegaBytesConverter {

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(111523);
    String testFileName = "/test.txt";
    Path pathToFile = Paths.get("target" + testFileName);
    System.out.println(sizeInKilobytes(pathToFile.toFile()));
    System.out.println(filesize_in_Bytes(pathToFile.toFile()));
  }

  public static void printMegaBytesAndKiloBytes(long kiloBytes) {
    long oneMegaByte = 1024;
    long remainingKiloBytes = kiloBytes % oneMegaByte;
    long megaBytes = (kiloBytes - remainingKiloBytes) / oneMegaByte;

    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
  }

  public static long sizeInKilobytes(File file) {
    long fileSizeInBytes = file.length();
    long fileSizeInKB = fileSizeInBytes / 1024;
    return fileSizeInBytes;
  }
  
  private static String filesize_in_Bytes(File file) {
    return file.length()+" bytes";
}

}
