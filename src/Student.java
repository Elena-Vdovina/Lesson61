public class Student implements Comparable<Student> {

  private String name;
  private int score; // балл

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return name + " (" + score + ")";
  }

  @Override
  public int compareTo(Student other) {
    return score - other.score;
  }
}

