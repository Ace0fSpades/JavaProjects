package project_bank;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Bank {
    public static void main(String args[]){
        try{
            String filePath = new File("").getAbsolutePath();
            filePath += "/src/project_bank/card_holders.txt";
            List<String> data = new ArrayList<>();
            data = Files.readAllLines(Paths.get(filePath), Charset.defaultCharset());

            System.out.println(Arrays.toString(data.toArray()));


        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
