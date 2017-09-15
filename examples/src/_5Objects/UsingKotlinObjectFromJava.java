package _5Objects;

public class UsingKotlinObjectFromJava {
    public static void main(String[] args) {
        JSingleton.INSTANCE.foo();
        KSingleton.INSTANCE.foo();
    }
}
