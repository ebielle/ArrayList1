import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Andrea", 24);
        Student student2 = new Student("Luca", 25);
        Student student3 = new Student("Matteo", 23);

        ArrayList<Student> studenti = new ArrayList<Student>(Arrays.asList(student1, student2, student3));

        System.out.println(studenti);

        studenti.add(new Student("Giulia", 22));
        studenti.add(new Student("Marco", 24));
        studenti.add(new Student("Greta", 26));
        studenti.add(new Student("Emma", 23));

        System.out.println(studenti);
    }
}