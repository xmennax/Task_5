// Question 2

public class Main {
    public static void main(String[] args) {

        String text="this IS mY teXT";
        IText iText = new UpperCaseText();
        TextEditor textEditor = new TextEditor(iText);
        textEditor.setText(text);
        textEditor.PrintText();


        IText iText1 = new LowerCaseText();
        TextEditor textEditor1 = new TextEditor(iText1);
        textEditor1.setText(text);
        textEditor1.PrintText();


        IText iText2 = new isEmpty();
        TextEditor textEditor2 = new TextEditor(iText2);
        textEditor2.setText(text);
        textEditor2.PrintText();
    }
}