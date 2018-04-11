package php.DesignPatterns.Creational.AbstractFactory;

public class HtmlFactory extends AbstractFactory {
    public Text createText(String content) {
        return new HtmlText(content);
    }
}