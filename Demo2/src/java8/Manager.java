package java8;

import java.util.List;
import java.util.function.Predicate;

public interface Manager<T> {
	public default void insert(T t) {
		getList().add(t);
	}

	public List<T> getList();

	public default void delete(Predicate<T> pred) {
		getList().removeIf(pred);
	}
	public void update(T t);
}