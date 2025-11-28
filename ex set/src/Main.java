import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Student> a = readCouse(sc, "A");
        Set<Student> b = readCouse(sc, "B");
        Set<Student> c = readCouse(sc, "C");

        Set<Student> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total Student: "+total.size());
        sc.close();
    }

    private static Set<Student> readCouse(Scanner sc, String course){
        System.out.print("How many students for course "+ course + " ? ");
        int n = sc.nextInt();
        Set<Student> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            Integer code = sc.nextInt();
            set.add(new Student(code));
        }

        return set;
    }
}