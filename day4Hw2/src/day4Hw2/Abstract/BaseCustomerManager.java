package day4Hw2.Abstract;

import day4Hw2.Entites.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public  void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to DB: "+ customer.getFirstName());
	}

}
