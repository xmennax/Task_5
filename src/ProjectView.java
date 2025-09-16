public class ProjectView extends IDE{
    public ProjectView(String name){
        super(name);
    }
    @Override
    public void update(String rename) {
        System.out.println("(ProjectView) File renamed " + rename + " successfully");
    }
}
