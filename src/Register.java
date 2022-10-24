import java.util.ArrayList;
import java.util.Arrays;

public class Register implements Name{

    @Override
    public ArrayList<String> getNames() {
        String[] names = {"Béla", "Géza"};
        ArrayList<String>nameList = new ArrayList<>(Arrays.asList(names));

        return nameList;
    }
    
    
}
