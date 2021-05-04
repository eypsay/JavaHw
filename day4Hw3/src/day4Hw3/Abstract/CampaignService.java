package day4Hw3.Abstract;

import day4Hw3.Entites.Campaign;

public interface CampaignService extends BaseService{
	public void add(Campaign campaign);

	public void update(Campaign campaign);

	public void delete(Campaign campaign);

	public void getAll(Campaign[] campaigns);
	

}
