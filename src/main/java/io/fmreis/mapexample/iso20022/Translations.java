package io.fmreis.mapexample.iso20022;

import java.util.HashMap;
import java.util.Map;

public class Translations {

    private static Map<String, String> map;

    // Instantiating the static map
    static
    {
        map = new HashMap<>();
        map.put("1", "GFG");
        map.put("2", "Geek");
        map.put("3", "GeeksForGeeks");
    }

    public static String translate(String string){
        return map.get(string);
    }

}
