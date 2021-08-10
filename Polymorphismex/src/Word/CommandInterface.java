package Word;

public interface CommandInterface {
    void uppercase(int startIndex, int endIndex);
    void cut(int startIndex, int endIndex);
    void paste(int startIndex, int endIndex);
}
