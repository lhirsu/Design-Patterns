package builder.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserTest {

    public static void main(String[] args) {
        User user = new User.Builder("user", "pass")
                .setAddress("address")
                .setPhone("phone")
                .setAge(21)
                .build();

        log.info(user.toString());

    }

}