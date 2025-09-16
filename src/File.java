public class File extends SubjectFile {
   private String rename;
   private double size;
   private String type;
    public File(String rename , double size , String type){
        this.rename = rename;
        this.size = size;
        this.type = type;
    }

    public String getRename() {
        return rename;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void PrintAll(){
        System.out.println("File Name: " + getRename());
        System.out.println("File Size: " + getSize());
        System.out.println("File Type: " + getType());
    }

}
