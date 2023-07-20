package com.rndayala.designpatterns.abstractfactory;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("You have created WindowsButton.");
    }
}
