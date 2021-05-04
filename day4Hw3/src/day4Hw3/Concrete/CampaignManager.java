package day4Hw3.Concrete;

import day4Hw3.Abstract.CampaignService;
import day4Hw3.Entites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " added a new campaign  in the system");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " updated  campaign  in the system");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " removed  campaign  in the system");

	}

	@Override
	public void getAll(Campaign[] campaigns) {
		for (Campaign campaign : campaigns) {
			System.out
					.println(campaign.getName() + " " + campaign.getDescription() + " " + campaign.getDiscountValue());

		}

	}

}
