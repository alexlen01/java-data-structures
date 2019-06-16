package dev.datastructures.hashtables;

import static org.junit.Assert.assertTrue;

public class UserTest {

    public void test_users_equal() {
        User user1 = new User("mkyong", 35, "111222333");
        User user2 = new User("mkyong", 35, "111222333");

        assertTrue(user1.equals(user2));

        User2 user21 = new User2("mkyong", 35, "111222333");
        User2 user22 = new User2("mkyong", 35, "111222333");

        assertTrue(user21.equals(user22));

        User3 user31 = new User3("mkyong", 35, "111222333");
        User3 user32 = new User3("mkyong", 35, "111222333");

        assertTrue(user31.equals(user32));
    }
}
