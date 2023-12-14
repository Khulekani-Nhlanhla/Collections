import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
        System.out.println("");
        for (String element:list) {
            System.out.println(element);
        }
        System.out.println("This is using the iterator");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String element = iter.next();
            System.out.println(element);
        }



}
}