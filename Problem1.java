import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem1 {
    private List<String> allStrings;
    private static String[] mapping= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T",
            "U","V","W","X","Y","Z"};

    Problem1(){
        allStrings = new LinkedList<String>();
    }

    public void listAllStrings(ArrayList<Integer> array, int index, String currentString){
        if(array.size()==index){
            allStrings.add(currentString);
        } else {

            String temp = currentString + getCharactor(array.get(index));
            listAllStrings(array,index+1,temp);

            if(index+1<array.size()){
                String temp1 = currentString + getCharactor(array.get(index)*10+array.get(index+1));
                listAllStrings(array,index+2,temp1);
            }
        }
    }

    public void printList(){
        for(int i=0;i<allStrings.size();i++){
            System.out.println(allStrings.get(i));
        }
    }

    String getCharactor(int number){
        return mapping[number-1];
    }
}
