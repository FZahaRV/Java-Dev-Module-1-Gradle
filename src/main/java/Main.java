import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(new User("Zahar", "Fedorchuk"));
        System.out.println(json);
    }
}
