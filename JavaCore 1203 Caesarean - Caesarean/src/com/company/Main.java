package com.company;

/*

Level 11 Lection 11. Fourth Correct Inheritance Chain
Arrange correctly the “chain of inheritance” in the classes: House (house), Cat (cat), Dog (dog), Car (car).

Requirements:
1. The Solution class must have a public House class.
2. In the class Solution there must be a public class Cat (cat).
3. The Solution class must have a public Dog class.
4. In the class Solution there must be a public class Car (machine).
5. The House class should not be inherited from our classes.
6. The Cat class should not be inherited from our classes.
7. The Dog class should not be inherited from our classes.
8. The Car class should not be inherited from our classes.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}

