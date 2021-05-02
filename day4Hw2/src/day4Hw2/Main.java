package day4Hw2;

import java.text.SimpleDateFormat;
import day4Hw2.Abstract.BaseCustomerManager;
import day4Hw2.Concrete.NeroCustomerManager;
import day4Hw2.Entites.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.save(new Customer(1, "eyyup", "sayilir",  new SimpleDateFormat("dd/MM/yyyy").parse("1/1/1978"), "123456"));

	}

}
