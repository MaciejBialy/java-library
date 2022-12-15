package pl.bialy.maciej.java.library.io.file;

import pl.bialy.maciej.java.library.model.Library;

public interface FileManager {
    Library importData();

    void exportData(Library library);
}