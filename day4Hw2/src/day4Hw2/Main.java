package day4Hw2;

import java.time.LocalDate;

import day4Hw2.Abstract.BaseCustomerManager;
import day4Hw2.Adapters.MernisServiceAdapter;
import day4Hw2.Concrete.NeroCustomerManager;
import day4Hw2.Concrete.StarbucksCustomerManager;
import day4Hw2.Entites.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// BaseCustomerManager baseCustomerManager = new NeroCustomerManager();

		BaseCustomerManager starbucksCustomer = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomer.save(new Customer(1, "eyyüp", "sayýlýr", LocalDate.of(2000, 12, 12), "11122233344"));
		starbucksCustomer.save(new Customer(2, "ali", "veli", LocalDate.of(1999, 1, 1), "98765432198"));

		BaseCustomerManager neroCustomer = new NeroCustomerManager();
		neroCustomer.save(new Customer(1, "engin", "demirog", LocalDate.of(2020, 12, 12), "12345678912"));
	}

}
