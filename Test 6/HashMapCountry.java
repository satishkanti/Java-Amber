import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapCountry {
    private HashMap<String, String> m1;

    public HashMapCountry(){
        m1 = new HashMap<>();
    }

    public HashMap<String, String> storeCountryCapital(String countryName, String capital) {
        m1.put(countryName, capital);
        return m1;
    }

    public String retrieveCapital(String countryName) {
        return m1.get(countryName);
    }

     public String retrieveCountry(String capitalName) {
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public HashMap<String, String> createInvertedMap() {
        HashMap<String, String> m2 = new HashMap<>();
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            m2.put(entry.getValue(), entry.getKey());
        }
        return m2;
    }

    public ArrayList<String> getCountryList() {
        ArrayList<String> countryList = new ArrayList<>(m1.keySet());
        return countryList;
    }

    public static void main(String[] args) {
        HashMapCountry c1 = new HashMapCountry();

        c1.storeCountryCapital("India", "New Delhi");
        c1.storeCountryCapital("Japan", "Tokyo");
        c1.storeCountryCapital("Australia", "Canberra");
        c1.storeCountryCapital("South Africa", "Cape Town");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capital to be searched: ");
        String capital = sc.nextLine();
        System.out.println("Enter the country to be searched: ");
        String country = sc.nextLine();

        String res1 = c1.retrieveCapital(country);
        System.out.println("Capital of " + country + " " + res1);
        
        String res2 = c1.retrieveCountry(capital);
        System.out.println("Country with " + capital + " "+ res2);

        HashMap<String, String> invertedMap = c1.createInvertedMap();
        System.out.println("Inverted Map M2: " + invertedMap);

        ArrayList<String> countryList = c1.getCountryList();
        System.out.println("Country List: " + countryList);

        sc.close();
    }

}
