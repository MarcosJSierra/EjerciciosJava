import java.util.ArrayList;
import utils.ValueGeneration;


public class Selection {
    public static void main(String[] args){
        ValueGeneration valuesGenerator = new ValueGeneration();
        var numbersList = valuesGenerator.getIntegerArray(10);
        numbersList = selectionSort(numbersList);
        System.out.println("Step: " + numbersList);
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unorderedList){
        int minValueIndex = -1;
        Integer minValue;
        for(int i = 0; i < unorderedList.size() - 1; i++){
            minValueIndex = i;
            for(int j = i + 1; j < unorderedList.size(); j++){
                minValueIndex = (unorderedList.get(j) < unorderedList.get(minValueIndex))?
                    j : minValueIndex;
            }
            unorderedList.add(i, unorderedList.remove(minValueIndex));

            System.out.println("Step: " + unorderedList);
        }
        return unorderedList;
    }

}
