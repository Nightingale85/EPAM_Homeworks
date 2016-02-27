package task6;

import java.util.Arrays;

/**
 * Created by Lammi on 24.02.2016.
 */
public class Notepad {

    private  Note [] notes;

    Notepad (int quantityNotes){

        notes = new Note[quantityNotes];}

    public static void main(String[] args) {
        Notepad notepad = new Notepad(1);
        notepad.addNote("first note");
        System.out.println(notepad.notes.length);
        notepad.addNote("second note");
        System.out.println(notepad.notes.length);
        notepad.addNote("third note");
        System.out.println(notepad.notes.length);
        notepad.showAllNotes();
        notepad.removeNoteByIndex(1);
        System.out.println("After removing");
        notepad.showAllNotes();
    }

    public  boolean addNote (String note){
        for (int i = 0; i < notes.length; i++){
            if (notes[i] == null){
                notes[i] = new Note(note);
            return true;}
        }
        notes = Arrays.copyOf(notes, notes.length*2);

        for (int i = notes.length/2; i < notes.length; i++){
            if (notes[i] == null){
                notes[i] = new Note(note);
                return true;}
        }
        return false;
    }
    public  boolean removeNoteByIndex (int index){
        if (index < notes.length) {
            notes[index] = null;
            return true;
        }
        return false;
    }
    public  boolean editNote (String note, int index ){
        if (notes[index] != null && index < notes.length) {
            notes[index].setNote(note);
            return true;
        }
        return false;
    }
    public  void showAllNotes (){
        for (Note note: notes)
            if (note != null)System.out.println("[" + note + "]");
    }

}
