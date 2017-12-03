import java.util.Hashtable;
import java.util.List;

public class event_management {

    public static void main(String[] args){

//        // Seating Options
//        int[] seatingTypes = {1, 2, 4};
//
//        // New Venue
//        Venue calledSomething = new Venue("Some Venue", "123 Fake St.", "Fakeville", "Illinois", "USA", "60000-0000", 1000, seatingTypes);

        String test1 = "[sold]";
        String test2 = "[[regular]]";
        String test3 = "[[[sold, regular]]]";
        String test4 = "[[[unsold, vip],[sold, regular]]]";
        String test5 = "[[[unsold, vip],[sold, regular]]],[[[sold, vip],[sold, regular]]]";

        //Hashtable<String, List<Row>> result = SeatingType.parse(test1);
        //Hashtable<String, List<Row>> result = SeatingType.parse(test2);
        //Hashtable<String, List<Row>> result = SeatingType.parse(test3);
        Hashtable<String, List<Row>> result = SeatingType.parse(test5);
        for (int i = 0; i < result.size(); i++) {
            List<Row> currentRow = result.elements().nextElement();
            System.out.println(currentRow.toString());
        }
    }

}
