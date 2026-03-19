package main.models;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class order {
    private String nomclient;
    private Map<String, Integer> items;

    public order (String nomclient, Map<String, Integer> items){
        this.nomclient = nomclient;
        this.items = items;
    }


}
