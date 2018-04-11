package php.DesignPatterns.Creational.AbstractFactory.Tests;

import php.DesignPatterns.Creational.AbstractFactory.AbstractFactory;
import php.DesignPatterns.Creational.AbstractFactory.HtmlFactory;
import php.DesignPatterns.Creational.AbstractFactory.JsonFactory;
import php.DesignPatterns.Creational.AbstractFactory.Text;

class AbstractFactoryTest {
    public void testCanCreateHtmlText() {
        AbstractFactory factory = new HtmlFactory();
        Text text = factory.createText("foobar");
    }

    public void testCanCreateJsonText() {
        AbstractFactory factory = new JsonFactory();
        Text text = factory.createText("foobar");
    }
}