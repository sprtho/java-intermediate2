package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenerixBox integerBox = new GenerixBox();
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

    }
}
