
    // private String name;

    // public String getName() {
    //     return name;
    // }

    // public void setName(String newName) {
    //     this.name = newName;
    // }

class Vechicle {
    protected String brand = "Ford";
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
      }
}
class Car extends Vechicle {
    private String modelName = "Mustang"; 

    public static void main(String[] args) {
        // Day8 obj = new Day8();
        // obj.setName("Madhav");
        // System.out.println(obj.getName());
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
