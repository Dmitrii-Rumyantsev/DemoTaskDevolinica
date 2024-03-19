package Controller;

import Model.Note;
import View.ViewNotes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerNote {
    private final Scanner scanner = new Scanner(System.in);

    private final ViewNotes viewNotes = new ViewNotes();

    private final List<Note> notes = new ArrayList<>();

    public void actionSelect(){
        viewNotes.printShow();
        while (true) {
            viewNotes.printChoice();
            if (scanner.hasNextInt()){
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        addNewNote();
                        break;
                    }
                    case 2: {
                        showNotes();
                        break;
                    }
                    case 3: {
                        editNote();
                        break;
                    }
                    case 4: {
                        deleteNote();
                        break;
                    }
                    case 5: {
                        return;
                    }
                    default: {
                        viewNotes.printChoiceToOneToFive();
                        scanner.next();
                    }
                }
            }
            else {
                viewNotes.printChoiceToOneToFive();
                scanner.next();
            }
        }
    }

    public void addNewNote(){
        viewNotes.printAddNewNote();
        String title = scanner.next();
        notes.add(
                new Note(title,
                writeWhileNotEND())
        );
    }

    public void showNotes(){
        viewNotes.printShowNotes();
        if (notes.isEmpty()){
            viewNotes.printNullList();
        }
        else {
            viewNotes.printList(notes);
        }
    }

    public void editNote(){
        viewNotes.printIndex();
        if (scanner.hasNextInt()) {
            int idx = scanner.nextInt() - 1;
            if (idx < 0 || idx >= notes.size()) {
                viewNotes.notIndex();
                return;
            }

            notes.get(idx)
                    .setTextNote(writeWhileNotEND()
                    );
        }
        else {
            scanner.next();
            viewNotes.notNumber();
        }
    }

    public String writeWhileNotEND() {
        StringBuilder stringBuilder = new StringBuilder();
        viewNotes.printWhileNotEnd();

        while (true) {
            String str = scanner.nextLine();
            if ("end".equals(str)) {
                break;
            }
            stringBuilder.append(str).append("\n");
        }

        return stringBuilder.toString().trim();
    }
    public void deleteNote(){
        viewNotes.printDeleteNum();

        if (scanner.hasNextInt()) {

            int idx = scanner.nextInt() - 1;
            if (idx < 0 || idx >= notes.size()) {
                viewNotes.printOutInList();
                return;
            }
            viewNotes.printDeleteTitle(notes.get(idx).getTitle());
            notes.remove(idx);


        }
        else {
            viewNotes.notNumber();
        }

    }
}
