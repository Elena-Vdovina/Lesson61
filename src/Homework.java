import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Homework {

// Используйте класс Student из урока 60 (см. Student.java).
// Создайте список учеников с баллами.
// Попросите пользователя ввести минимальный проходной балл.
// Выведите список учеников согласно следующим условиям:
//   каждый ученик выведен в отдельной строке
//   сумма баллов каждого ученика выше минимального проходного
//   ученики отсортированы по убыванию среднего балла
//   в списке не больше 10 учеников (извините, конкурс)
// Для обработки и вывода результата используйте потоки (Stream).

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Student> students = new ArrayList<>();
    students.add(new Student("Anton", 3));
    students.add(new Student("Boris", 2));
    students.add(new Student("Valera", 4));
    students.add(new Student("Artem", 5));
    students.add(new Student("Oleg", 4));
    students.add(new Student("Pavel", 3));
    students.add(new Student("Elena", 2));
    students.add(new Student("Valeria", 4));
    students.add(new Student("Artemia", 5));
    students.add(new Student("Olga", 4));
    students.add(new Student("Andrey", 3));
    students.add(new Student("Denis", 2));
    students.add(new Student("Vadim", 4));
    students.add(new Student("Maksim", 5));
    students.add(new Student("Egor", 4));
    System.out.print("Введите проходной балл ");
    int score=Integer.parseInt(br.readLine());


  }
}
