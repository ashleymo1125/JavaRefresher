public class HelloWorld
{
    // main method aka entry point for the code
    public static void main(String args[])
    {
        // print statement
        System.out.println("Hello World");
        // another print statement
        System.out.println("Its a big beautiful world out there!");
        // a 3rd print statement
        System.out.println("I don't know what else to say!");

        HelloWorld hw = new HelloWorld();
        hw.printANumber(3);

    }

    public void printANumber(int num)
    {
        System.out.println(num + ": Is a number!");
    }
}
