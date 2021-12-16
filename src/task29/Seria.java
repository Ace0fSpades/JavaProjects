package task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seria {

    public static void main(String[] args) throws IOException {


        String[] territoryInfo = {"У Германии 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
        String[] resourcesInfo = {"У Германии 100 золота", "У России 80 золота", "У Франции 90 золота"};
        String[] diplomacyInfo = {"Германия воюет с Россией, Франция заняла позицию нейтралитета"};

        SavedGame savedGame = new SavedGame(territoryInfo, resourcesInfo, diplomacyInfo);


        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\sylva\\IdeaProjects\\JavaProjects\\src\\task29\\save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);


        objectOutputStream.writeObject(savedGame);


        objectOutputStream.close();
    }
}