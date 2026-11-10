import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "Rina", "Computer Science", "Bandung"));
        list.add(new Student(102, "Andi", 2, "Jakarta"));
        list.add(new Student(103, "Wulan", 1, "Cimahi"));
        list.add(new Student(104, "Budi", "Mathematics", "Garut"));
        list.add(new Student(105, "Citra", 3, "Lembang"));
 
        Collections.sort(list, Comparator.comparing(Student::getName));

        System.out.println(" ArrayList sorted by name ");
        for (Student s : list) {
            System.out.println(s);
        }

        Vector<Student> vector = new Vector<>();
        vector.add(new Student(201, "Dewi", 1, "Bandung"));
        vector.add(new Student(202, "Eko", "Information Systems", "Bogor"));
        vector.add(new Student(203, "Fajar", "Computer Science", "Subang"));
        vector.add(new Student(204, "Gita", 4, "Cianjur"));
        vector.add(new Student(205, "Hadi", 1, "Sumedang"));
 
        System.out.println("\n=== Vector: Computer Science students ===");
        for (Student s : vector) {
            if (s.getDepartment().equalsIgnoreCase("Computer Science")) {
                System.out.println(s);
            }
        }
    }
    
}
