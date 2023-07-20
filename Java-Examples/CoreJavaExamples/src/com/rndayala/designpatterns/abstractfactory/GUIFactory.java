package com.rndayala.designpatterns.abstractfactory;

/**
 * Abstract factory knows about all (abstract) product types.
 * It declares a set of creation methods for product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}