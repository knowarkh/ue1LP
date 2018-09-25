package td_pile;

public interface IPile<T> {

    public T depiler();

    public void empiler(T t);

    public boolean estVide();
}
