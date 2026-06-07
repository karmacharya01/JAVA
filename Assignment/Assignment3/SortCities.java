import java.util.*;

public class SortCities {

    public static void main(String[] args) {

        String cities[] = {"Kathmandu","Pokhara","Lalitpur","Butwal","Biratnagar","Bhakatapur","Kavre"};

        Arrays.sort(cities);

        System.out.println("Cities in ascending order:");

        for(String city : cities) {
            System.out.println(city);
        }
    }
}