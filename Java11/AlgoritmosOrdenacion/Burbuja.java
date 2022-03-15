import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Burbuja{
    public static void main(String[] args){
        var exampleList = getArray();
        System.out.println(exampleList);
        Comparator<Integer> ints = (n1, n2) -> n1 - n2;
        Integer temp = 0;
        for(int i = (exampleList.size()); i > 0; i--){
            for (int j = 0; j < (i - 1); j++){
                if(ints.compare(exampleList.get(j), exampleList.get(j+1)) > 0){
                    temp = exampleList.get(j);
                    exampleList.set(j, exampleList.get(j+1));
                    exampleList.set(j+1, temp);
                }
            }
            System.out.println("Step: " + exampleList);
        }
    }

    public static ArrayList<Integer> getArray(){
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            numbersList.add(Integer.valueOf(random.nextInt(100)));
        }
        return numbersList;
    }
}