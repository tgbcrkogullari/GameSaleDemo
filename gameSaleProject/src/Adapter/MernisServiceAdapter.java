package Adapter;

import java.rmi.RemoteException;

import Abstracts.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		 boolean result = false;
		 
		 try {
			  result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					  Long.parseLong(gamer.getNationalityId()), 
					  gamer.getFirstName().toUpperCase(), 
					  gamer.getLastName().toUpperCase(),
					  gamer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

}
