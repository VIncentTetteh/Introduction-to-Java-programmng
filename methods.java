public class methods{
    public static void main(String[] args){
        //calling of methods in the main method
        NoReturn();
        System.out.println(Returns());

    }
    // declaring a method that doesnt return a value
    public static void NoReturn(){
        System.out.println(" I am not returning nothing");
    }
    // declaring a method that returns a value
    public static int Returns(){
        int a;
        int b;
        int c;
        a = 2;
        b = 3;
        c = a + b;
        return c;
    }
}