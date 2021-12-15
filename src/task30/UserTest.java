package task30;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
        private User user1;
        private User user2;
        private User user3;
        private User user4;
        private User user5;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        user1 = new User("Евгений", 35, "MALE");
        user2 = new User("Марина", 34, "FEMALE");
        user3 = new User("Алина", 7, "FEMALE");

        user4 = new User("", 5, "");
        user5 = new User("Anthony", 0, "");
    }
    @org.junit.jupiter.api.Test
    void getAllUsers() {
        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        actual.add(user4);
        actual.add(user5);


        Assert.assertEquals(expected, actual);
    }



    @org.junit.jupiter.api.Test
    void getHowManyUsers() {

        int expected = User.getHowManyUsers();
        int actual = 5;
        Assert.assertEquals(expected, actual);
    }



    @org.junit.jupiter.api.Test
    void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();
        int actual = 35 + 34 + 7+5;
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void newUser_EMPTY_NAME() {

        for (User i : User.getAllUsers()){
            if (i.getName() != null && i.getName().isEmpty()) {
                Assert.fail("Попытка создания пользователя с пустым именем");
            }
        }
    }

    @org.junit.jupiter.api.Test
    public void newUser_AGE_ZERO() {

        for (User i : User.getAllUsers()) {
            if (i.getAge() <= 0) {
                Assert.fail("Попытка создания пользователя c не допустимым возрастом");
            }
        }
    }

    @org.junit.jupiter.api.Test
    public void newUser_SEX_NO_NULL() {
        for (User i : User.getAllUsers()) {
            if (i.getSex() != null && i.getSex().isEmpty()) {
                Assert.fail("Попытка создания пользователя с указанием пола = null");
            }
        }
    }



}

