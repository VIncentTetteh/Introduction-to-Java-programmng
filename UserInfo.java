import java.util.Scanner;

public class UserInfo{
    public static void main(String[] args) {

        String name, nationality, marital_status;
        char sex;
        int age,favorite_food;


        Scanner accept_user_name = new Scanner(System.in);
        Scanner accept_user_age = new Scanner(System.in);
        Scanner accept_user_nationality = new Scanner(System.in);
        Scanner accept_user_sex= new Scanner(System.in);
        Scanner accept_user_marital_status = new Scanner(System.in);
        Scanner accept_user_favorite_food = new Scanner(System.in);

        System.out.println("Enter your Name ");
        name = accept_user_name.nextLine();

        System.out.println("Enter your Age ");
        age = accept_user_age.nextInt();

        System.out.println("Enter your Nationality ");
        nationality = accept_user_nationality.nextLine();

        System.out.println("Enter your sex F for female and M for male ");
        sex = accept_user_sex.next().charAt(0);

        System.out.println("Enter your Marital Status ");
        marital_status = accept_user_marital_status.nextLine();

        System.out.println("Choose your Favorite Food  from the list");
        System.out.println("1. Rice \n2. Fufu \n3. Banku");
        favorite_food = accept_user_favorite_food.nextInt();
        if (favorite_food == 1){
            System.out.println("Rice");
        }
        else if (favorite_food == 2){
            System.out.print("Fufu");
        }
        else if (favorite_food == 3){
            System.out.println("Banku");
        }


        System.out.println(name + " Personal Information");
        System.out.println("________________________________");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Sex: " + sex);
        System.out.println("Marital Status: " + marital_status);
        System.out.println("Favorite Food: " + favorite_food);
        
       



    }
}