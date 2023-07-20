package com.rndayala.designpatterns.abstractfactory;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
