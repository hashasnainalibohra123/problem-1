import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    private void get2letter(List<List<String>> list, List<String> templist, String code){
        if(templist.size()!=0){list.add(templist);}
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<code.length()-1;i+=2){
            if(Integer.parseInt(code.substring(i,2))-1<26) {
                sb.append(Integer.parseInt(code.substring(i, 2)) - 1 + 'A');
            }else{
                sb.append(code.charAt(i)-'0'-1+'A');
                sb.append(code.charAt(i+1)-'0'-1+'A');
            }
        }
        templist.add(sb.toString());
    }
    private void get1letter(List<List<String>> list, List<String> templist, String code){
        if(templist.size()!=0){list.add(templist);}
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<code.length();i++){

            sb.append(code.charAt(i)-'0'-1+'A');
            getdecodings(sb.toString() + code.substring(i));

        }
        templist.add(sb.toString());
        get2letter(list, new ArrayList<>(), code);


    }
    List<String> getdecodings(String code){
        List<List<String>> list = new ArrayList<>();
        String code = "123";
        get1letter(list, new ArrayList<>(), code);
        get2letter(list, new ArrayList<>(), code);
        return list;


    }

    public static void main(){
        String []input ={"123"};



    }
}
