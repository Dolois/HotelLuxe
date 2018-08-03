
public class Application
{
	public static void main(String[] args)
	{
		// créer une instance hot5 de la classe HotelCinqEtoiles
		HotelCinqEtoiles hot5 = new HotelCinqEtoiles();
		
		hot5.h1=("Hotel Georges V 5*****");
		hot5.h2=("Chambre de 35 m2");
		hot5.h3=("Piscine couverte chauffée");
		hot5.h4=450.55;
		hot5.descriptionPiscineLuxe();
		System.out.println();
		
		// créer une instance hot7 de la classe HotelSeptEtoiles
		HotelSeptEtoiles hot7 = new HotelSeptEtoiles();
		
		hot7.h1=("Hotel Ritz 7*******");
		hot7.h2=("Chambre de 45 m2");
		hot7.h3=("Piscine couverte chauffée avec jacuzzi");
		hot7.h4=550.55;
		hot7.descriptionPiscineLuxe();
		System.out.println();
		
		HotelCinqEtoiles tax1 = new HotelCinqEtoiles();
		
		tax1.t1=("Limousine 3,00m");
		tax1.t2=("Bar intérieur");
		tax1.t3=("Télévision");
		tax1.t4=120.55;
		tax1.reserverTaxi();
		System.out.println();
		
		HotelSeptEtoiles tax2 = new HotelSeptEtoiles();
		
		tax2.t1=("Limousine 3,50m");
		tax2.t2=("Bar intérieur");
		tax2.t3=("Télévision, téléphone");
		tax2.t4=170.25;
		tax2.reserverTaxi();
	}
}
