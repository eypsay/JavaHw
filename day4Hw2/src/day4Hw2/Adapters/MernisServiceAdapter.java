package day4Hw2.Adapters;

import java.rmi.RemoteException;

import day4Hw2.Abstract.CustomerCheckService;
import day4Hw2.Entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap clientKpsPublicSoap = new KPSPublicSoapProxy();

		boolean checkResult = false;
		System.out.println("Customer Info for Mernis Service: " + customer.getNationalityId() + " "
				+ customer.getFirstName() + " " + customer.getLastName() + " " + customer.getDateOfBirth().getYear());

		try {
			checkResult = clientKpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return checkResult;

	}

}
