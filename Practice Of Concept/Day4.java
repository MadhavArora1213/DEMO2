public class Day4 {
    public static void main(String[] args) {
        // String a = "Hello";
        // String b = "World";
        // int c = 5;
        // System.out.println(a.length());
        // System.out.println(a.toUpperCase());
        // System.out.println(a.toLowerCase());
        // System.out.println(a.indexOf("l"));

        // System.out.println(a+" "+b);
        // System.out.println(a.concat(b));
        // System.out.println(c+a);

        // double d = 5.667;
        // double f = 5.668;
        // System.out.println(Math.max(d, f));
        // System.out.println(Math.min(d, f));
        // System.out.println(Math.sqrt(64));
        // System.out.println(Math.abs(-4.7));
        // System.out.println(Math.random());

        // Array

        String[] cars = { "volvo", "alto", "ferrari", "i20" };
        cars[0] = "Lamborgini";
        // System.out.println(cars[0]);
        // System.out.println(cars.length);
        // for(int i = 0; i<cars.length;i++){
        // System.out.println(cars[i]);
        // }
        // for (String i : cars) {
        // System.out.println(i);
        // }
        // int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        // for (int i = 0; i < myNumbers.length; ++i) {
        //     for (int j = 0; j < myNumbers[i] .length; ++j) {
        //         System.out.println(myNumbers[i][j]);
        //     }
        // }
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}