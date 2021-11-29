package models;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.ToDoubleFunction;

public interface OrderedList<E> extends List<E> {
    void sort();
    int indexOfByBinarySearch(E searchItem);
    boolean merge(E item, BinaryOperator<E> merger);
    Comparator<? super E> getOrdening();

    default double aggregate(ToDoubleFunction<E> mapper) {
        double sum = 0;
        // TODO aggregate the mapped value across all items in the list

        return sum;
    }
}
