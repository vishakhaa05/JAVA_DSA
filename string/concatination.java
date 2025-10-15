public class concatination {
    public static void main(String[] args) {
         String name = "tony";
         String lastName = " stark";
            String fullName = name + lastName;
            System.out.println("Full Name: " + fullName);
            // for length
            System.out.println("Length of full name: " + fullName.length());
           // CharAt
           for(int i = 0; i < fullName.length(); i++){
            System.out.println("Character at index " + i + ": " + fullName.charAt(i));
           }
           // compare

              if (name.compareTo(lastName) > 0) {
                  System.out.println("Strings are equal");
                } else {
                  System.out.println("Strings are not equal");
              }

              // substring
              String sentence = "My name is Tony stark";
              String naam = sentence.substring(11, sentence.length());
                System.out.println("Substring: " + naam);
    }
}
