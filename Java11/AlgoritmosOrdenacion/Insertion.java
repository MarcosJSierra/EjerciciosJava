import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Insertion{
    public static void main(String[] args){
        var numbersList = getArray();
        System.out.println("Original Order: " + numbersList);
        Comparator<Integer> ints = (n1, n2) -> n1 - n2;
        boolean change = false;
        for(int i = 1; i < numbersList.size(); i++){
            change = false;
            for(int j = i-1; j >= 0; j--){
                if(ints.compare(numbersList.get(i), numbersList.get(j)) > 0){
                    if(change){
                        numbersList = change(numbersList, i, j+1);
                        change = false;
                    }
                    break;
                } else if (ints.compare(numbersList.get(i), numbersList.get(j)) <= 0){
                    if (!change)
                        change = true;
                    continue;
                }
            }
            if (change){
                numbersList = change(numbersList, i, 0);
            }
            System.out.println("Step: " + numbersList);
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

    public static ArrayList<Integer> change(ArrayList<Integer> list1, int initialPosition, int insertPosition){
        var temp = list1.get(initialPosition);
        list1.remove(initialPosition);
        list1.add(insertPosition, temp);
        return list1;
    }
}