package memento.editor;

public interface Command {
    String getName();
    void execute();
}