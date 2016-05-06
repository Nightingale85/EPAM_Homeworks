package builder;

import java.math.BigInteger;

/**
 * @author Sergey Solovyov
 */
public class User {
    private  String email;
    private  int password;
    private  String nick;
    private  int age;
    private  Gender gender;
    private BigInteger phone;

    public   enum  Gender {MALE, FEMALE}

    public static class UserBuilder {
        private  String email;
        private  int password;
        private  String nick;
        private  int age;
        private  Gender gender;
        private  BigInteger phone;

        public UserBuilder(String email, int password) {
            this.email = email;
            this.password = password;
        }

        public UserBuilder nick(String nick) {
            this.nick = nick;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder phone(BigInteger phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    private User(UserBuilder builder) {
        email = builder.email;
        password = builder.password;
        nick = builder.nick;
        age = builder.age;
        gender = builder.gender;
        phone = builder.phone;
    }
    @Override
    	public String toString() {
        		StringBuilder builder = new StringBuilder("User{\n");
        		builder.append("email = ").append(email);
        		builder.append("\npassword = ").append(password);
        		if (nick != null) {
            			builder.append("\nnick = ").append(nick);
            		}
        		if (age != 0) {
            			builder.append("\nage = ").append(age);
            	}
        		if (gender != null) {
            			builder.append("\ngender = ").append(gender);
            		}
                if (phone != null) {
                     builder.append("\nphone = ").append(phone);
                   }
        		builder.append("\n}");
        		return builder.toString();
        	}
}

