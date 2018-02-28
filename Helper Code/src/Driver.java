import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        DesiredSum ds = new DesiredSum(list,7);

        System.out.println(ds.getAnswer());

    }
}
