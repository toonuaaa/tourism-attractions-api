package sg.edu.ntu.singastays.exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(Long id) {
        super("Could not find category with id: " + id + ".");
    }

}
