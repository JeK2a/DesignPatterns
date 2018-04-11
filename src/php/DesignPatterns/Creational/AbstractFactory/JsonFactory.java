package php.DesignPatterns.Creational.AbstractFactory;

public class JsonFactory extends AbstractFactory {
    public Text createText(String content) {
        return new JsonText(content);
    }
}