public class Day5 {

    // static void MyMethod() {
    //     System.out.println("Hello you are inside the functon");
    // }

    // static void Paramaters(String fname, int age) {
    //     System.out.println("My name is " + fname + " and my age is " + age);
    // }

    // static void checkAge(int age) {
    //     if (age >= 18) {
    //         System.out.println("You are eligible to vote");
    //     } else {
    //         System.out.println("You are not eligible to vote");
    //     }

    // }

// static int returnSomething(int x){
//     return x * 2;
// }
// static double returnSomething(double x){
//     return x * 2;
// }
// static float returnSomething(float x){
//     return x * 2;
// }

// Recursion

static int sum(int a){
    if(a>0){
        return a + sum(a-1);
    }else{
        return 0;
    }
}

    public static void main(String[] args) {
        // MyMethod();
        // Paramaters("Madhav", 19);
        // checkAge(19);

        // System.out.println(returnSomething(5));
        // System.out.println(returnSomething(5.36347435646));
        // System.out.println(returnSomething(5.7));

        int result = sum(10);
        System.out.println(result);
    }
}