package Concretes;

import Abstracts.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Yeni kampanya eklendi : "+ campaign.getCampaignName() +" Kampanyas� %"+ campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri g�ncellendi : "+ campaign.getCampaignName() +" "+ campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : "+ campaign.getCampaignName());
		
	}

}
