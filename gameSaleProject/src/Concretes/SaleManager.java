package Concretes;

import Abstracts.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + "," + gamer.getFirstName() +" "+ gamer.getLastName() + " tarafýndan satýn alýndý.");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" " + gamer.getLastName() + " , " + game.getGameName() + " oyununu satýn alýrken " + campaign.getCampaignName() + " kampanyasýndan yararlandý.");
	}

}
