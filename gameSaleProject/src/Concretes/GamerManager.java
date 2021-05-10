package Concretes;



import Abstracts.IGamerCheckService;
import Abstracts.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {
	
	private IGamerCheckService _gamerCheckService;

	public GamerManager(IGamerCheckService _gamerCheckService) {
		super();
		this._gamerCheckService = _gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(_gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Yeni oyuncu eklendi : "+ gamer.getFirstName() +" "+ gamer.getLastName());
		}else {
			System.out.println("Geçersiz kiþi");
		}		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri güncellendi : "+ gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu bilgileri silindi : "+ gamer.getFirstName() + gamer.getLastName());
		
	}

}
