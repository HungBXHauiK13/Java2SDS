package GenericBT3;

public interface ITinhToan<T> {
    public T cong(T...args);
    public T hieu(T t1, T t2);
    public T nhan(T...args);
    public T chia(T t1, T t2);
}
