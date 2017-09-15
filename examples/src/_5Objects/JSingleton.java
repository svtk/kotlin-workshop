package _5Objects;

public class JSingleton {
    public final static JSingleton INSTANCE = new JSingleton();

    private JSingleton() {
    }

    public void foo() {}
}
