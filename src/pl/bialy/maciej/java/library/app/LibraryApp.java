package pl.bialy.maciej.java.library.app;

public class LibraryApp {
    private static final String APP_NAME = "Biblioteka v3.0";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}