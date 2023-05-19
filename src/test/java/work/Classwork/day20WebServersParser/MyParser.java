package work.Classwork.day20WebServersParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import work.Classwork.day22httpPost.Search;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyParser {
    public static void main(String[] args) throws IOException {
        MyParser runParser = new MyParser();
        runParser.parseGSON(); //Парсер JSON
//        runParser.fromJSON();  //Создание JSON
    }

    private static final String JSON = "src/test/resources/recipe.json";

    public void parseGSON() throws IOException {
        Gson gson = new Gson();
        Recipe recipe = gson.fromJson(new JsonReader(new FileReader(JSON)), Recipe.class);
        System.out.println(recipe.getIngredlist());
        System.out.println(recipe.getPreptime());
        System.out.println(recipe.getRecipename());
    }

//    public void fromJSON() {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        List<Ingredient> ingredlist = new ArrayList<>();
//        ingredlist.add(new Ingredient(100, "water"));
//        ingredlist.add(new Ingredient(10, "salt"));
//
//        Recipe recipe = new Recipe("Fish", ingredlist, 200);
//        System.out.println(gson.toJson(recipe));
//    }

    public static String fromGSON(Search search) {
        Gson gson = new Gson();
        return gson.toJson(search);
    }
}
