package Model;

import java.util.Date;

public class Note {
    private String title;

    private Date dateCreate;
    private String textNote;

    public Note(String title, String textNote) {
        this.title = title;
        this.dateCreate = new Date();
        this.textNote = textNote;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreat(){
        return dateCreate;
    }

    public void setDateCreat(Date dateCreate){
        this.dateCreate = dateCreate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getTextNote() {
        return textNote;
    }

    public void setTextNote(String textNote) {
        this.textNote = textNote;
    }
}
