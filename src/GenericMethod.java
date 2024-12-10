import java.util.List;

public class GenericMethod <T> {

    public void printList(List<T> list){

        for (T element: list){
            System.out.println(element);
        }


    }
}
