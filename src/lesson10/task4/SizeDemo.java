package lesson10.task4;

public class SizeDemo {
    public static void main(String[] args) {
        printAllSizes();
    }

    public static void printAllSizes(){
        Size sizes [] = Size.values();
        for (Size s : sizes){
            System.out.println(s+" european:"+s.getEuroSize()+" "+s.getDescription());
        }
    }
}
