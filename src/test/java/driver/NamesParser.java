package driver;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import pageobjects.objects.Names;


import java.io.FileReader;
import java.io.IOException;

public class NamesParser {
    public static void main(String[] args) throws IOException {
        NamesParser runParser = new NamesParser();
        runParser.parseGSON(); //Парсер JSON
    }

    private static final String JSONFILE = "src/test/java/settings/names.json";

    public void parseGSON() throws IOException {
        Gson gson = new Gson();
        Names names = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        System.out.println(names.getLongname());
        System.out.println(names.getShortname());
        System.out.println(names.getPartiallongname());
        System.out.println(names.getPartialshortname());
    }
}
