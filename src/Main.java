import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

    String s;
    ArrayList<String> list = new ArrayList<>();

    //This is the IO Character Based Stream way of reading a File.
    try(BufferedReader Br = new BufferedReader(new FileReader("Employees.txt")))
    {
        while ((s = Br.readLine()) != null){
            list.add(s);

        }

    }catch(IOException e){
        System.out.println("Data Loading Error");
    }
        System.out.printf("The Size of the List is: " + list.size()+"\n");
        System.out.println("This is the original list\n"+".");
        for (String element:list) {
            System.out.println(element);
        }
        System.out.println(".");
        Collections.sort(list);
        System.out.println("This is the result after sorting the array list: \n"+".");

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String element = iter.next();
            System.out.println(element);
        }
        System.out.println(".");
        System.out.println("This is the for loop:\n"+".");
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size();i++){
            String element = list.get(i);
            System.out.println(element);
        }




}
}