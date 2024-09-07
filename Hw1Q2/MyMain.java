import java.util.Scanner;
import personobj.person;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class MyMain{

    public static void store(InputStream input, LinkedList<person> list){
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            String[] split = currentLine.split(",");
            person newPerson = new person(split[0], split[1], split[2]);
            list.add(newPerson);
        }
        scanner.close();
    }
    public static void display(PrintStream output, LinkedList<person> list) {
        for (int i = 0; i < list.size(); i++) {
            person p = list.get(i);
            output.println(p.toString());
        }
    }
    public static int find(String sid, LinkedList<person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        LinkedList<person> plist = new LinkedList<>();
        FileInputStream stream = new FileInputStream("data.txt");
        store(stream, plist);
        display(System.out, plist);
        System.out.println("\nFinding people:");
        System.out.println(find("1", plist) + "\n");
        System.out.println(find("2", plist) + "\n");
        System.out.println(find("3", plist) + "\n");
        System.out.println(find("17", plist) + "\n");
    }

}