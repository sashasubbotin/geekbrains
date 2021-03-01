import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> telList = phonebook.get(name);
        if (telList == null) telList = new ArrayList<>();
        telList.add(tel);
        phonebook.put(name, telList);
    }

    public void get(String name) {
        System.out.println(name + " " + phonebook.get(name));
    }

    public void info() {
        System.out.println(phonebook);
    }
    
}
