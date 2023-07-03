package text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Text {
    public static void main(String[] args){



    }
    public static List<String> textReader(){
        List<String> szovegek = new ArrayList<>(Arrays.asList());
            Scanner scanner = new Scanner(System.in);
            String szoveg = scanner.nextLine();
            if(szoveg.length() <= 25){
                szovegek.add(szoveg);
            }
            if(szoveg.length() > 25){
                szovegek.add(szoveg.substring(0,19) + "...");
            }
        return szovegek;
    }
}
