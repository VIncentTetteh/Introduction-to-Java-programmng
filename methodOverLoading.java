public class methodOverLoading{
    public static void main(String[] args){
        System.out.println(add(12,45));
        System.out.println(add(12.25,45.1));

    }
    // YOu over load a function when you call it multiple time for different purpose
    
    public static int add(int a , int b){
        int c =  a + b;
        return c;
    }
    public static double add(double a , double b){
        double c = a + b;
        return c;
    }
}