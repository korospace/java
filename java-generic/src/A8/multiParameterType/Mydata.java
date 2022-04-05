package A8.multiParameterType;

public class Mydata<T,U> {
    private T firstPropertiy;

    private U secondProperty;

    public Mydata(T first, U second) {
        this.firstPropertiy = first;
        this.secondProperty = second;
    }

    public T getFirstPropertiy() {
        return firstPropertiy;
    }

    public void setFirstPropertiy(T firstPropertiy) {
        this.firstPropertiy = firstPropertiy;
    }

    public U getSecondProperty() {
        return secondProperty;
    }

    public void setSecondProperty(U secondProperty) {
        this.secondProperty = secondProperty;
    }
}
