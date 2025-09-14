public class UpperCaseText implements IText{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
