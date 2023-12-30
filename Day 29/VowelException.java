public class VowelException extends Exception{
    VowelException(String str){
        super(str);
    }

    static void checkForVowel(String input) throws VowelException{
        if (!input.toLowerCase().matches(".*[aeiou].*")) {
            throw new VowelException("NoVowelsException: The string must contain at least one vowel.");
        } else {
            System.out.println("The string contains vowels.");
        }
    }

    public static void main(String[] args) {
        try {
            String stringWithVowels = "Hello";
            checkForVowel(stringWithVowels);

            String stringWithoutVowels = "Brr";
            checkForVowel(stringWithoutVowels);
        } catch (VowelException e) {
            e.printStackTrace();
        }
    }
    
}
