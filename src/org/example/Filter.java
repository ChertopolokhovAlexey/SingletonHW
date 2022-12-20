package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    List<Integer>  result = new ArrayList<>();
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer < treshold){
                logger.log("Элемент " +integer+" проходит");
                result.add(integer);
            }
            if (integer >= treshold){
                logger.log("Элемент " +integer+" не проходит");
            }

        }
        return result;
    }
}
