package test;


import viewController.ViewControl;

public class MockModelMain {
    public static void main(String[] args) {
        new ViewControl(new MockModel()); //Later on it will call Boardgame()

    }
}