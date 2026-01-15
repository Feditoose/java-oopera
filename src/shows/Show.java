package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        int i = 1;
        for (Actor act : listOfActors) {
            System.out.println(i + " " + act.toString());
            i++;
        }
    }

    public void addActor(Actor actor) {
        for (Actor act : listOfActors) {
            if (act.equals(actor)) {
                System.out.println("Такой актер уже есть в списке!");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println(actor.getName() + " " + actor.getSurname() + " добавлен в список.");
    }

    public void changeActor(Actor actor, String surname) {
        for (Actor act : listOfActors) {
            if (act.getSurname().equals(surname)) {
                listOfActors.set(listOfActors.indexOf(act), actor);
                System.out.println("Актер изменен.");
                return;
            }
        }
        System.out.println("Актера с такой фамилией нет!");
    }

    public void directorInt() {
        System.out.println(director.toString());
    }
}
