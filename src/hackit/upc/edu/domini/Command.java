package hackit.upc.edu.domini;

/**
 * Created by Joan on 11/02/2016.
 */
public enum Command {
    LOAD('L'),
    DELIVER('D'),
    UNLOAD('U'),
    WAIT('W');

    private Character letter;

    Command(Character letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return letter.toString();
    }
}
