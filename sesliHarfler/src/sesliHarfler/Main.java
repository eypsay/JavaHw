package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] kalinSesli = {'a','ý','o','u'};
		char[] inceSesli = {'e','i','ö','ü'};
		String mesaj = "Bugün hava çok güzel";
		
		for (int i=0;i<mesaj.length();i++) {
			for(int j=0;j<kalinSesli.length;j++) {
				if (kalinSesli[j] == mesaj.charAt(i)) {
					System.out.println("mesajdaki kalýn sesli: "+kalinSesli[j]);
				}
			}
			for(int k=0;k<inceSesli.length;k++) {
				if (inceSesli[k] == mesaj.charAt(i)) {
					System.out.println("mesajdaki ince sesli: "+inceSesli[k]);
				}
			}
		}
	}

}
