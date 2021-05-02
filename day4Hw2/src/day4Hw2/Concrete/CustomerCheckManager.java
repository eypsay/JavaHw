package day4Hw2.Concrete;

import day4Hw2.Abstract.CustomerCheckService;
import day4Hw2.Entites.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
