package practice.recursion.tail;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall {
    TailCall apply();
    default boolean isComplete() {
        return false;
    }
    default <T> T result() {
        throw new Error("not implemented");
    }
    default <T> T invoke() {
        return Stream.iterate(this, TailCall::apply)
                .filter(TailCall::isComplete)
                .findFirst()
                .get()
                .result();
    }
}
