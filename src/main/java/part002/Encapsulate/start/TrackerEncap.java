package ru.dimcher.part002.start;

import ru.dimcher.part002.models.*;
import java.util.*;

public class TrackerEncap {
    private ItemEncap[] items = new ItemEncap[10];
    private int position = 0;
    private static final Random Rn = new Random();

    /**
     * Метод добавляет новую заявку
     */
    public ItemEncap add(ItemEncap item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }


    protected ItemEncap findById(String id) {
        ItemEncap result = null;
        for (ItemEncap item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + Rn.nextInt());
    }
/**
*Отображаем все заявки.
*Так как в задание сказано использовать комментарии
*Предварительно был создан класс Comments,в котором конструктор принимает новый аргумент
*comm-комментарий.
*Для того,чтобы вызвать этот конструктор,необходимо сначала проверить условие на соответствие
*нашего экземпляра result классу Comments.
*Далее,используем приведение типов(повышение)
*/
   public ItemEncap[] getAll() {
         ItemEncap[] result = new ItemEncap[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
            System.out.println(result[index].getName() + " " + result[index].getDescription());
            if(items[index] instanceof CommentsEncap){
                CommentsEncap comments = (CommentsEncap) result[index];
                System.out.println(result[index].getName() + " " + result[index].getDescription()
                        +" "+((CommentsEncap)result[index]).getComm());
            }
        }
        System.out.println("");
        return result;
    }
/**
*редактируем заявку по Id:
*Так как в задании указано использовать статические значения,передаём в метод 
*редактируемые переменные newName и newDescription;
*/
    public void editById(Item item) {
        ItemEncap result = null;
        for(ItemEncap itm:items) {
            if(itm.equals(findById(item.getId()))) {
                    result = itm;
                    result.setName(item.getName());
                    result.setDescription(item.getDescription());
                }
            }


    }
//удаляем заявку по Id:
    public void deleteById(String id) {

        for (int k = 0; k < items.length; k++) {
            items[k].setId("" + (k + 1));
            if (items[k].getId().equals(id)) {
                items[k].setName(null);
                items[k].setDescription(null);
            }
            for (int i = 0; i < items.length; i++) {
                for (int j = 0; j < items.length; j++) {
                    if (items[j].getName() == null) {
                        if ((j + 1) <= items.length - 1) {
                            ItemEncap temp = items[j];
                            items[j] = items[j + 1];
                            items[j + 1] = temp;
                        }
                    }
                }

            }
        }
    }
    /**Фильтр отображает только заявки,соответствующие нечетному порядковому номеру*/
    public ItemEncap[] findBy() {
        ItemEncap[] result = new ItemEncap[10];
        for (int i = 0; i <items.length ; i++) {
            for (int j = 0; j <items.length ; j++) {
                if(i%2!=0){
                    result[i] = items[i];
                }
            }

        }

        return result;
    }
}
