import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static char convertToCharacter(int a){
        char ch;
        if(a<27 && a>=0){
            return (char)(64+a);
        }else
        return '0';
    }
    public static List<Integer> permuteNumber(int a){
     List<Integer> arr=new ArrayList<>();
     //digit separation
        while(a>0){
            int d= a%10;
            a=a/10;
            arr.add(d);
        }
     return arr;
    }

    public static List<String> hashCode(int a){
        List<String> str=new ArrayList<>();
        String s="";
       List<Integer> arr= new ArrayList<>();
       int i;
       for(int j=0;j<1;j++) {
           s="";
           arr=permuteNumber(a);
           for (i = 0; i < arr.size(); i++) {
               if (convertToCharacter(arr.get(i)) != '0') {
                   s = (Character.toString(convertToCharacter(arr.get(i)))) + s;
               } else {
                   break;
               }
           }
           if(i==arr.size())
           str.add(s);
       }

        return str;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(hashCode(n));
        System.out.println("Hello World!");
    }
}
