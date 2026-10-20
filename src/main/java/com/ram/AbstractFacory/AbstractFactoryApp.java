package com.ram.AbstractFacory;

public class AbstractFactoryApp {
    private Button button;
    private Checkbox checkbox;

    // The client accepts any UIFactory implementation seamlessly
    public AbstractFactoryApp(UIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paintUI() {
        button.paint();
        checkbox.render();
    }
}
