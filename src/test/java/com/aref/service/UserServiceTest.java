package com.aref.service;

import com.aref.dao.UserDao;
import com.aref.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserDao daoMock;

    @InjectMocks
    private UserService service;

    @Captor
    private ArgumentCaptor<User> userArgumentCaptor;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByIndex() throws Exception {
    }

    private void getFirst() {
        System.out.println("First commit 1");
    }

    private void getSecond() {
        System.out.println("bad commit");
    }

    private void getThird() {
        System.out.println("Second commit 2");
    }

    private void getLast() {
        System.out.println("last good commit");
    }

    @Test
    public void save() throws Exception {
        User user1 = new User.Builder().withAge(20).withName("aref").build();
        service.save(user1);
        Mockito.verify(daoMock).saveUser(userArgumentCaptor.capture());
        assertEquals(200, userArgumentCaptor.getValue().getAge());
        assertEquals("aref", userArgumentCaptor.getValue().getName());
    }

}