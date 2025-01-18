package az.turingacademy;

public class Gen <T>{

    private T object;

    public Gen (T object){

        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
}
