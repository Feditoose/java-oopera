import persons.Actor;
import persons.Director;
import persons.Gender;
import persons.Person;
import shows.Ballet;
import shows.Opera;
import shows.Show;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Сергей", "Бурунов", Gender.MALE, 152);
        Actor actor2 = new Actor("Данила", "Козловский", Gender.MALE, 186);
        Actor actor3 = new Actor("Александра", "Бортич", Gender.FEMALE, 171);

        Director director1 = new Director("Василий", "Борвихин", Gender.MALE, 24);
        Director director2 = new Director("Кузнецов", "Валерий", Gender.MALE, 68);

        Person musicAuthor = new Person("Кани", "Вест", Gender.MALE);
        Person choreograph = new Person("Марья", "Сергеевна", Gender.FEMALE);

        Show tipicalShow = new Show("Вандалист", 90, director2, new ArrayList<Actor>());
        tipicalShow.addActor(actor1);
        tipicalShow.addActor(actor2);

        Opera opera = new Opera("Богема", 120, director1, new ArrayList<Actor>(), musicAuthor, "Добавим позже....", 30);
        opera.addActor(actor2);

        Ballet ballet = new Ballet("Щелкунчик", 105, director1, new ArrayList<Actor>(), musicAuthor, "Добавим позже....", choreograph);
        ballet.addActor(actor3);

        System.out.println("Выводим списки актеров каждого спектакля:");
        System.out.println("Обычный спектакль:");
        tipicalShow.printListOfActors();
        System.out.println("Опера:");
        opera.printListOfActors();
        System.out.println("Балет");
        ballet.printListOfActors();

        System.out.println("Меняем актеров:");
        opera.changeActor(actor1, "Козловский");
        System.out.println("Проверяем список актеров:");
        opera.printListOfActors();
        opera.changeActor(actor3, "Михалков");

        System.out.println("Выводим тексты либретто:");
        System.out.println("Опера:");
        opera.printLibrettoText();
        System.out.println("Балет:");
        ballet.printLibrettoText();

        //'не хватает метода "Распечатать информацию о режиссере"'- есть, directorInf,
        //просто в задании нет пункта с его использованием
    }
}
