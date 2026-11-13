public class Player{
    private String firstName;
    private String lastName;
    private int number;

    public Player() {
        this.number = 1;

    }
    public Player(String firstName, String lastName, int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Player number must be greater than zero.");
        }
        setFirstName(firstName);
        setLastName(lastName);
        this.number = number;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) {
        this.firstName = (firstName == null || firstName.trim().isEmpty()) ? null : firstName;
    }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) {
        this.lastName = (lastName == null || lastName.trim().isEmpty()) ? null : lastName;
    }

    public int getNumber() { return number; }
    public void setNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Player number must be greater than zero.");
        }
        this.number = number;
    }

    public String formatPlayerInformation() {
        return "#" + number + " " + firstName + " " + lastName;
    }
}
}
