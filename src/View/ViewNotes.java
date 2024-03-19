package View;


import Model.Note;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class ViewNotes {

    private final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public void printShow(){
        System.out.println(
                """
                        Добро пожаловать в приложение "Заметки"!
                        1. Добавить заметку
                        2. Просмотреть заметки
                        3. Редактировать заметку
                        4. Удалить заметку
                        5. Выход"""
        );
    }

    public void printAddNewNote(){
        System.out.print(
                "Введите заголовок заметки: "
        );
    }

    public void printIndex(){
        System.out.print(
                "Введите номер заметки для редактирования: "
        );
    }

    public void printShowNotes(){
        System.out.println(
                "Список заметок:"
        );
    }

    public void printChoice(){
        System.out.print(
                "Выберите действие (введите номер): "
        );
    }

    public void printDelete(){
        System.out.println(
                "Заметка \"Покупки\" успешно удалена."
        );
    }

    public void printWhileNotEnd(){
        System.out.println(
                "Введите новый текст заметки (для завершения введите \"end\"):"
        );
    }

    public void printChoiceToOneToFive(){
        System.out.println(
                "Выберите действие от 1 до 5"
        );
    }

    public void printOutInList(){
        System.out.println(
                "Выход за пределы списка"
        );
    }

    public void notNumber(){
        System.out.println(
                "Введено не число!"
        );
    }

    public void notIndex(){
        System.out.println(
                "Такого индекса нет!"
        );
    }

    public void printDeleteNum(){
        System.out.print(
                "Введите номер заметки для удаления: "
        );
    }

    public void printNullList(){
        System.out.println(
                "Список заметок: (пусто)"
        );
    }

    public void printDeleteTitle(String title){
        System.out.println(
                "Заметка \"" + title + "\" успешно удалена."
        );
    }

    public void printList(List<Note> notes){
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i).getTitle() +
                    " - " + dateFormat.format(notes.get(i).getDateCreat())
                    + '\n' + notes.get(i).getTextNote());
        }
    }
}
