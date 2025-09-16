public class InheritanceHierarchyView extends IDE{
    public InheritanceHierarchyView(String name){
        super(name);
    }
    @Override
    public void update(String rename) {
        System.out.println("(InheritanceHierarchyView) File renamed " + rename + " successfully");
    }
}
