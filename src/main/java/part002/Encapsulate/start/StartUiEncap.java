package ru.dimcher.part002.start;

import ru.dimcher.part002.models.*;

public class StartUiEncap{
    public static void main(String[] args){
        TrackerEncap tracker = new TrackerEncap();
        tracker.add(new TaskEncap("first task", "first desc"));
        tracker.add(new TaskEncap("second task", "second desc"));
        tracker.add(new TaskEncap("third task", "third desc"));
        tracker.add(new TaskEncap("fourth task", "fourth desc"));
        tracker.add(new TaskEncap("fifth task", "fifth desc"));
        tracker.add(new TaskEncap("sixth task", "sixth desc"));
        tracker.add(new TaskEncap("seventh task", "seventh desc"));
        tracker.add(new TaskEncap("eighth task", "eighth desc"));
        tracker.add(new TaskEncap("ninth task", "ninth desc"));
        tracker.add(new CommentsEncap("tenth task", "tens desc","this is comments"));
	//демонстрация работы фильтра
        for (int i =0;i<tracker.findBy().length;i++) {
            if (tracker.findBy()[i] != null) {
                ItemEncap item = tracker.findBy()[i];
                System.out.println(item.getName()+" "+item.getDescription());
            }
        }

        tracker.getAll();
        //демонстрация работы метода удаления(элемента с пятым порядковым номером)
        tracker.deleteById("5");
        tracker.getAll();
        //демонстрация работы метода редактирования
        tracker.editById(new Item("2","Dmitry","junior"));
        tracker.getAll();
    }
}
