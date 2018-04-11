package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.checkboxes.WindowsCheckbox;
import refactoring_guru.abstract_factory.example.buttons.WindowsButton;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}