import java.util.Scanner;

public class Day3{
    public static void main(String[] args) {
        int age = 24;
        if(age<18 && age>0){
   
            System.out.println("You are a child");
            System.out.println("You can't vote");

        }else if(age>18){
            System.out.println("You are an adult");
            System.out.println("You can vote");
        }
        else{
            System.out.println("Not a valid age");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
       int day= sc.nextInt();
       switch (day) {
        case value:
            
            break;
       
        default:
            break;
       }
    }
}