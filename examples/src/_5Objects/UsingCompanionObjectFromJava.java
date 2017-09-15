package _5Objects;

public class UsingCompanionObjectFromJava {

    public static void main(String[] args) {

        A.Companion.create();
//        A.create() //- doesn't compile

        B.Companion.staticFunction();
        B.staticFunction();
    }
}
