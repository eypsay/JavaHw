package day4Hw2.Concrete;

import day4Hw2.Abstract.BaseCustomerManager;
import day4Hw2.Abstract.CustomerCheckService;
import day4Hw2.Entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer))

		{
			System.out.println("Person is Valid!!!");
			super.save(customer);
			
		} else {
			System.out.println("Not a valid Person!");
		}
	}

}
