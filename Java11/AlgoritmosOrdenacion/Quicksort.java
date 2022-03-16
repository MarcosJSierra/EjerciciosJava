import java.util.ArrayList;
import java.util.Random;

public class Quicksort{
    public static Random random = new Random();
    public static void main(String[] args){
        var numbersList = getArray();
        System.out.println("Step: " + numbersList);
        numbersList = quicksort(numbersList);
        System.out.println("Final: " + numbersList);
    }

    public static ArrayList<Integer> quicksort(ArrayList<Integer> list1){
        if(list1.isEmpty())
            return list1;
        Integer pivotValue = (list1.size() > 1) ?  list1.get( random.nextInt(list1.size())) : list1.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        boolean repeat = false;
        if(list1.size() > 1){
            for(Integer number: list1){
                if (number < pivotValue) {
                    left.add(number);
                } else { 
                    if(number == pivotValue){
                        if (repeat){
                            left.add(number);
                        }else{
                            repeat = true;
                            right.add(number);
                        }
                    }else{
                        right.add(number);
                    }
                }
            }
            System.out.println("left: " + left + " | right: " + right + " | pivot: " + pivotValue);
            var orderedLeftList = quicksort(left);
            var orderedRightList = quicksort(right);
            list1 = new ArrayList<Integer>();
            list1.addAll(orderedLeftList);
            list1.addAll(orderedRightList);
            return list1;
        } else {
            return list1;
        }
    }

    public static ArrayList<Integer> getArray(){
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            numbersList.add(Integer.valueOf(random.nextInt(100)));
        }
        return numbersList;
    }
}