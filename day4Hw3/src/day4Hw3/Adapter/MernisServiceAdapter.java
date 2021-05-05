package day4Hw3.Adapter;

import java.rmi.RemoteException;

import day4Hw3.Abstract.PlayerCheckService;
import day4Hw3.Entites.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoap clientKpsPublicSoap = new KPSPublicSoapProxy();

		boolean checkResult = false;
		System.out.println("Player Info for Mernis Service: " + player.getNationalityId() + " "
				+ player.getFirstName() + " " + player.getLastName() + " " + player.getBirthDate().getYear());

		try {
			checkResult = clientKpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getBirthDate().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return checkResult;

	}
}
