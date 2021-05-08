package day5Hw1.business.concretes;

import day5Hw1.business.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void sendMail(String to, String body) {
		// TODO Auto-generated method stub
		System.out.println("Activation code send to *" + to +" "+ body+". Please check your email");
	}

}
