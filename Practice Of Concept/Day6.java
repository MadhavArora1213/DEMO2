public class Day6 {
    // final int x = 8;

    // static void MyMethod(){
    // System.out.println("Hello World");
    // }
    // public void MyMethod1(){
    // System.out.println("Hello World");
    // }
    // int x;
    // public Day6(int y) {
    // System.out.println("Hello welcome to my era");
    // x=y;
    // }

    int modelyear;
    String modelname;

    public Day6(int year, String name) {
        modelname = name;
        modelyear = year;
    }

    public static void main(String[] args) {
        Day6 obj = new Day6(1969, "Mustang");
        System.out.println(obj.modelname);
        System.out.println(obj.modelyear);

        // System.out.println(obj.x);
        // Day6 obj1 = new Day6();
        // // obj.x = 10;
        // System.out.println(obj.x);
        // obj.MyMethod1();
        // MyMethod();
        // System.out.println(obj1.x);

    }
}