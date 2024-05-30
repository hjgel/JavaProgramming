package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bd = new BigData();
        bd.data = new Data();
        System.out.println("bigData.count = " + bd.count);
        System.out.println("bigData.data = " + bd.data);

        System.out.println("bigData.value = " + bd.data.value);
    }
}
