package companyManager.fileoperations;

import companyManager.fileoperations.reader.*;

/**
 * Przyklad wzorca projektowego Fabryka
 * Klasa fabryki jest odpowiedzialna za stworzenie odpowiedniego obiektu czytnika
 * w zaleznosci od podanego rozszerzenia pliku
 */
public class EmployeeReaderFactory {
    //metoda zwracajac typ interfejsowy
    public static EmployeeReader createReader(String path) {
        if (path.endsWith(".txt")) {
            return new TxtEmployeeReader(path);
        } else if (path.endsWith(".xml")) {
            return new XmlEmployeeReader(path);
        } else if (path.endsWith(".json")) {
            return new JsonEmployeeReader(path);
        }
        return null;
    }
}
