import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tóth Júlia, Szoft 2/n, 2022-10-24");
        Register register = new Register();
        ArrayList<String> nameList = register.getNames();
        for(String name : nameList){
            System.out.println(name);
        }
    }
}
