/*
* File: App.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 2/n 
* Date: 2022-10-24
* Github: https://github.com/haribomaci/
* Licenc: GNU GPL
*/


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
