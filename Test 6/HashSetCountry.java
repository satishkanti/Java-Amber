import java.util.*;

public class HashSetCountry {
    private HashSet<String> h1;

    public HashSetCountry(){
        h1 = new HashSet<>();
    }

    public HashSet<String> storeCountryNames(String countryName){
        h1.add(countryName);
        return h1;
    }

    public String retrieveCountry(String countryName){
        for(String country:h1){
            if(country.equalsIgnoreCase(countryName)){
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashSetCountry c1 = new HashSetCountry();

        c1.storeCountryNames("India");
        c1.storeCountryNames("USA");
        c1.storeCountryNames("China");
        c1.storeCountryNames("Australia");
        c1.storeCountryNames("England");
        c1.storeCountryNames("South Africa");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the country to be searched: ");
        String country = sc.nextLine();

        String res = c1.retrieveCountry(country);

        if(res!=null){
            System.out.println("Country " + country + " exists in H1");
        }else{
            System.out.println("Country " + country + " does not exist in H1");
        }
        sc.close();
    }
}
