package Concretes;

import Abstracts.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + "," + gamer.getFirstName() +" "+ gamer.getLastName() + " taraf�ndan sat�n al�nd�.");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" " + gamer.getLastName() + " , " + game.getGameName() + " oyununu sat�n al�rken " + campaign.getCampaignName() + " kampanyas�ndan yararland�.");
	}

}
