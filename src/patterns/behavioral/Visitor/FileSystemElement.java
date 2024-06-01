package patterns.behavioral.Visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}