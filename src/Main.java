import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    String s;
    TreeSet<String> TreeList = new TreeSet<>();

    //This is the IO Character Based Stream way of reading a File.
    try(BufferedReader Br = new BufferedReader(new FileReader("Employees.txt")))
    {
        while ((s = Br.readLine()) != null){
            TreeList.add(s);

        }

    }catch(IOException e){
        System.out.println("Data Loading Error");
    }
        System.out.printf("The Size of the List is: " + TreeList.size()+"\n");
        System.out.println("");
        for (String element:TreeList) {
            System.out.println(element);
        }
        System.out.println(".");
        System.out.println("This is using the iterator");
        System.out.println(".");
        Iterator<String> iter = TreeList.iterator();
        while(iter.hasNext()){
            String element = iter.next();
            System.out.println(element);
        }




}
}