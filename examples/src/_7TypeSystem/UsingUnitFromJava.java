package _7TypeSystem;

import kotlin.Unit;

public class UsingUnitFromJava implements Processor<Unit> {
    public Unit process() {
        // In Java you still have to return a value explicitly:
        return Unit.INSTANCE;
    }
}
