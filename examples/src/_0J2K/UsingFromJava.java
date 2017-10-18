package _0J2K;

public class UsingFromJava {
    public static void main(String[] args) {
        JPerson jPerson = new JPerson("Alice", 29);
        jPerson.getName();
        jPerson.setAge(jPerson.getAge() + 1);

        KPerson kPerson = new KPerson("Alice", 29);
        kPerson.getName();
        kPerson.setAge(kPerson.getAge() + 1);
    }
}
