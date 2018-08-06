
public class HotelSeptEtoiles implements HotelLuxe
{
	public String h1;		// nom hotel
	public String h2;		// superficie chambre
	public String h3;		// piscine hotel
	public double h4;		// prix nuit d'hotel 5*****
	
	public void descriptionPiscineLuxe()
	{
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println();
		System.out.println(getH1());
		System.out.println(getH2());
		System.out.println(getH3());
		System.out.println(getH4());
	}
	
	public String t1;		// type taxi
	public String t2;		// bar 
	public String t3;		// television, telephone
	public double t4;		// prix
	
	public void reserverTaxi()
	{
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println();
		System.out.println(getT1());
		System.out.println(getT2());
		System.out.println(getT3());
		System.out.println(getT4());
	}

	public String getH1() {
		return h1;
	}

	public void setH1(String h1) {
		this.h1 = h1;
	}

	public String getH2() {
		return h2;
	}

	public void setH2(String h2) {
		this.h2 = h2;
	}

	public String getH3() {
		return h3;
	}

	public void setH3(String h3) {
		this.h3 = h3;
	}

	public double getH4() {
		return h4;
	}

	public void setH4(double h4) {
		this.h4 = h4;
	}

	public String getT1() {
		return t1;
	}

	public void setT1(String t1) {
		this.t1 = t1;
	}

	public String getT2() {
		return t2;
	}

	public void setT2(String t2) {
		this.t2 = t2;
	}

	public String getT3() {
		return t3;
	}

	public void setT3(String t3) {
		this.t3 = t3;
	}

	public double getT4() {
		return t4;
	}

	public void setT4(double t4) {
		this.t4 = t4;
	}
}
