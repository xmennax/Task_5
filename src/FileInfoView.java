public class FileInfoView extends IDE{
    public FileInfoView(String name) {
        super(name);
    }
    @Override
    public void update(String rename) {
        System.out.println("(FileInfoView) File renamed " + rename + " successfully");
    }
}
