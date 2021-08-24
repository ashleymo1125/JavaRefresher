public class reverseString {

    // main method which is the entry point of the code
    public static void main(String args[])
    {
        // constructing a reverseString object so we can access its methods
        reverseString rs = new reverseString();
        // printing the result of the reverseMyString method
        System.out.println(rs.reverseMyString("Ashley Moyers"));
    }

    // reverseMyString method that is within the reverseString method class
    public String reverseMyString(String mystring)
    {
        // creating char array that has the same length as the string
        char[] charArray = new char[mystring.length()];
        // creating a variable called j
        int j = 0;
        // for loop that will iterate backwords
        for(int i = mystring.length() - 1; i >= 0; i--)
        {
            // adding to char array
            charArray[j] = mystring.charAt(i);
            // incrementing j so we can move forward on char array
            j++;
        }
        // creating a new string
        String newString = new String(charArray);
        // returning the new reserved string
        return newString;
    }
}
