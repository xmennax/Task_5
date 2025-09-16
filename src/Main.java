public class Main {
    public static void main(String[] args) {


        String project_name = "Task_5";
        IDE.name = project_name;
        IDE.PrintProjectName();
        File file=new File("User.Java" , 1500 , ".java");
        ProjectView projectView = new ProjectView(project_name);
        FileInfoView fileInfoView = new FileInfoView(project_name);
        InheritanceHierarchyView inheritanceHierarchyView = new InheritanceHierarchyView(project_name);
        file.addObserver(projectView);
        file.addObserver(fileInfoView);
        file.addObserver(inheritanceHierarchyView);
        file.notifyAllUsers(file.getRename());
        file.PrintAll();
        new GetKSize().getKSize(1500);
        new CodingType().getType();

    }
}