package com.rndayala.designpatterns.abstractfactory;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("You have created MacOSButton.");
    }
}
