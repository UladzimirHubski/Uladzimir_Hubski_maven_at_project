package driver;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import util.Data;
import util.Names;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataParser {

    private static final String JSONFILE = "src/test/resources/namesInput.json";

    public static String parseCode() throws IOException {
        Gson gson = new Gson();
        Data dataInput = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        String Code = dataInput.getCode();
        System.out.println(Code);

        return Code;
    }

    public static List parsedata() throws IOException {
        Gson gson = new Gson();
        Data dataInput = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        List<Names> data = dataInput.getData();
        System.out.println(data);

        return data;
    }
}
