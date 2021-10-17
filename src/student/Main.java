package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ekkasit.tan
 */
public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(1, "Ekkasit" , 3.99);
        Student std2 = new Student(1, "Ekkasit" , 2.34);

        StudentTable.insertStudent(std1);
        StudentTable.updateStudent(std2);
        StudentTable.removeStudent(std2);
    }
 
}
