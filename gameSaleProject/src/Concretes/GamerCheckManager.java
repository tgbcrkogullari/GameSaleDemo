package Concretes;

import Abstracts.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
	
		return true;
	}

}
