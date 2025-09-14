public class isEmpty implements IText {

    @Override
    public String formatText(String text) {
        return text.isEmpty() ? "Yes" : "NO";
    }
}
