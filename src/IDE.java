public abstract class IDE {
    public static String name;
    public IDE(String name){
        this.name = name;
    }

    public static void PrintProjectName(){
        System.out.println("You've Opened "+ name +" Project");
        System.out.println("File name: Customer.java");
    }
    public abstract void update(String rename);
}
