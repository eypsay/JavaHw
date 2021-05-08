package day5Hw1.business.abstracts;

import day5Hw1.entities.concretes.User;

public interface UserActivationService {
void add(User user);
void check(String activationCode,User user);
void activate(User user);
}
