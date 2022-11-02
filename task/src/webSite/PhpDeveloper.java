package webSite;

import projekt.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP Developer write code");
    }
}
