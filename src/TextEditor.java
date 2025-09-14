public class TextEditor {
    public String text;
    public IText itext;
    public TextEditor(IText itext){
        this.itext = itext;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void PrintText(){
        System.out.println(itext.formatText(text));
    }
}
