import java.util.*;
public class Two{
    public static void main(String[] args) {
         Box<Integer> intBox = new Box<>();
        intBox.setItem(12);
        int intValue = intBox.getItem();
        System.out.println( intValue);

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Ashish");
        String stringValue = stringBox.getItem();
        System.out.println( stringValue);
        
    }
}

class Box <T>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

