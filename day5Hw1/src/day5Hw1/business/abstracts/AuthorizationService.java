package day5Hw1.business.abstracts;

import day5Hw1.entities.concretes.User;

public interface AuthorizationService {
void login(String email,String pasword,User user);
void register(User user);
}
