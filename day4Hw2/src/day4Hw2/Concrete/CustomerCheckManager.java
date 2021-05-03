package day4Hw2.Concrete;

import day4Hw2.Abstract.CustomerCheckService;
import day4Hw2.Entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		//my fake control method
		
		return true;
	}

	
}
