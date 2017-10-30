package _8Lambdas;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

import java.util.List;

public class UsingFunctionTypesFromJava {
    public static void useKotlinLibrary() {
        List<Integer> list = CollectionsKt.listOf(1, 2, 3);
        boolean hasEven = CollectionsKt.any(list,
                new Function1<Integer, Boolean>() {
                    public Boolean invoke(Integer i) {
                        return i % 2 == 0;
                    }
                });
        System.out.println(hasEven);
    }

    public static void main(String[] args) {
        useKotlinLibrary();
    }
}
