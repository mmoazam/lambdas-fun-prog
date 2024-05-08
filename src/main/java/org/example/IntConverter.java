package org.example;
@FunctionalInterface
public interface IntConverter<T> {
    int convert(T t);
}
