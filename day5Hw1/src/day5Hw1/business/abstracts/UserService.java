package day5Hw1.business.abstracts;

import java.util.List;

import day5Hw1.entities.concretes.User;

public interface UserService {
void add(User user);
void getAll(List<User> users);
}
