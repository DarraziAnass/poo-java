package ma.enset.services;
@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);
}
