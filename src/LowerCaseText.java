public class LowerCaseText implements IText{
    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
