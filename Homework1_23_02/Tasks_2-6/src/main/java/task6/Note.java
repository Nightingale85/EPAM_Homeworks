package task6;

/**
 * Created by Lammi on 24.02.2016.
 */
public class Note {

    private String note;

    Note (String note){
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return note;
    }
}
