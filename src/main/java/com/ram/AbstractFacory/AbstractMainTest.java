package com.ram.AbstractFacory;

public class AbstractMainTest {
        public static void main(String[] args) {
            // App settings say "Dark Mode"
            UIFactory activeFactory = new DarktUIFactory();

            // Pass the factory to the application
            AbstractFactoryApp app = new AbstractFactoryApp(activeFactory);
            app.paintUI();
            // Outputs:
            // Rendering a Dark Mode Button.
            // Rendering a Dark Mode Checkbox.
            UIFactory lightActiveFactory= new LightUIFactory();
            AbstractFactoryApp app1 = new AbstractFactoryApp(lightActiveFactory);
            app1.paintUI();
        }
}
