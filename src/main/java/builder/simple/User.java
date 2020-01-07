package builder.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private String phone;
    private String address;
    private int age;

    public static class Builder {

        private final String username;
        private final String password;
        private String phone;
        private String address;
        private int age;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(username, password, phone, address, age);
        }

    }

}
