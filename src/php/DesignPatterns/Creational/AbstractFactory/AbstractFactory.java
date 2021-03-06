package php.DesignPatterns.Creational.AbstractFactory;

/**
 * In this case, the abstract factory is a contract for creating some components
 * for the web. There are two ways of rendering text: HTML and JSON
 */
public abstract class AbstractFactory {
    abstract public Text createText(String content);
}