package builder;

import java.math.BigInteger;

/**
 * @author Sergey Solovyov
 */
public class Main {

    private Main(){}

    public static void main(String[] args) {

        User user1 = (new User.UserBuilder("tanyat93@mail.ru", 5666).build());

        User user2 = (new User.UserBuilder("saltikovvladimir@gmail.com", 9999555).age(25)
                     .gender(User.Gender.MALE).nick("Vovan")
                     .phone(new BigInteger("0636669900")).build());

        System.out.println(user1);
        System.out.println(user2);
    }
}
