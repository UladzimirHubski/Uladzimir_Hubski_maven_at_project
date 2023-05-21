package driver;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import util.Names;

import java.io.FileReader;
import java.io.IOException;

public class NamesParser {
    private static final String JSONFILE = "src/test/resources/namesInput.json";

    public static String parseUserName() throws IOException {
        Gson gson = new Gson();
        Names names = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        String UserName = names.getUsername();
        System.out.println(UserName);

        return UserName;
    }

    public static String parseId() throws IOException {
        Gson gson = new Gson();
        Names names = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        String Id = names.getId();
        System.out.println(Id);

        return Id;
    }

    public static String parseRealName() throws IOException {
        Gson gson = new Gson();
        Names names = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        String RealName = names.getRealname();
        System.out.println(RealName);

        return RealName;
    }

    public static String parsePassword() throws IOException {
        Gson gson = new Gson();
        Names names = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        String Password = names.getPassword();
        System.out.println(Password);

        return Password;
    }

    public static String parseEmail() throws IOException {
        Gson gson = new Gson();
        Names names = gson.fromJson(new JsonReader(new FileReader(JSONFILE)), Names.class);
        String Email = names.getEmail();
        System.out.println(Email);

        return Email;
    }

}

