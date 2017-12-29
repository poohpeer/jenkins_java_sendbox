
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class User {

    private Logger logger = LoggerFactory.getLogger(User.class);
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        logger.info("Creating user.");
        this.firstName = firstName;
        this.lastName = lastName;
        logger.info("Created: " + this.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
