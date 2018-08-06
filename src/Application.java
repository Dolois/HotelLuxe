
public class Application
{
	public static void main(String[] args)
	{
		// créer une instance hot5 de la classe HotelCinqEtoiles
		HotelCinqEtoiles hot5 = new HotelCinqEtoiles();
		
		hot5.setH1("Hotel Georges V 5*****");
		hot5.setH2("Chambre de 35 m2");
		hot5.setH3("Piscine couverte chauffée");
		hot5.setH4(450.55);
		hot5.descriptionPiscineLuxe();
		System.out.println();
		
		// créer une instance hot7 de la classe HotelSeptEtoiles
		HotelSeptEtoiles hot7 = new HotelSeptEtoiles();
		
		hot7.setH1("Hotel Ritz 7*******");
		hot7.setH2("Chambre de 45 m2");
		hot7.setH3("Piscine couverte chauffée avec jacuzzi à bulles");
		hot7.setH4(550.55);
		hot7.descriptionPiscineLuxe();
		System.out.println();
		
		HotelCinqEtoiles tax1 = new HotelCinqEtoiles();
		
		tax1.setT1("Limousine 3,00m");
		tax1.setT2("Bar intérieur");
		tax1.setT3("Télévision");
		tax1.setT4(250.55);
		tax1.reserverTaxi();
		System.out.println();
		
		HotelSeptEtoiles tax2 = new HotelSeptEtoiles();
		
		tax2.setT1("Limousine 3,50m");
		tax2.setT2("Bar intérieur");
		tax2.setT3("Télévision, téléphone");
		tax2.setT4(370.25);
		tax2.reserverTaxi();
	}
}
