package persons;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void directorInf() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ".";
    }
}
