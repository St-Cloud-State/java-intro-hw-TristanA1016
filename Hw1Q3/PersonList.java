import java.util.Scanner;
import personobj.person;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class PersonList{
    private LinkedList<person> personList = new LinkedList<>();

    public void store(InputStream input){
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            String[] split = currentLine.split(",");
            person newPerson = new person(split[0], split[1], split[2]);
            personList.add(newPerson);
        }
        scanner.close();
    }
    public void display(PrintStream output) {
        for (int i = 0; i < personList.size(); i++) {
            person p = personList.get(i);
            output.println(p.toString());
        }
    }
    public int find(String sid) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getID().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        PersonList plist = new PersonList();
        FileInputStream stream = new FileInputStream("data.txt");
        plist.store(stream);
        plist.display(System.out);
        System.out.println("\nFinding people:");
        System.out.println(plist.find("1"));
        System.out.println(plist.find("2"));
        System.out.println(plist.find("3"));
        System.out.println(plist.find("17"));
    }
}



