public class Human {

    long yearOfBirth;
    private String name;
    String town;
    String jobTitle;

    Human(String name) {
        this.name = name;
    }

    Human(String name, long yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public String toStringTask1() {
        return "Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. " +
                "Будем знакомы!";
    }

    public String toStringTask2() {
        return "Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + " году. " +
                "Я работаю на должности " + jobTitle + ". " +
                "Будем знакомы!";
    }
}
