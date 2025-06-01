public class Staff extends Person {
    private String position;
    public Staff(String name, String id, String
 position) {
        super(name, id);
        this.position = position;
    }
    public void manageLibrary() {
        System.out.println(name + " is managing the library.");
 
    }
    @Override
    public void displayInfo() {
        System.out.println("Staff: " + name + ", ID: "
 + id + ", Position: " + position);
    }
 }