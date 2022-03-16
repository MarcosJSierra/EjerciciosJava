package utils;

import java.util.ArrayList;
import java.util.Random;

public class ValueGeneration {
    
    public static ArrayList<Integer> getIntegerArray(int size){
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < size; i++){
            numbersList.add(Integer.valueOf(random.nextInt(100)));
        }
        return numbersList;
    }
}
