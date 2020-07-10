package basics;

public class Weather {
	public static void main(String[] args) {
		// Program will suggest outfit based on temperature and sun condition
		
		int temperature = 45;
		String suncondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("Nice weather, wear shorts and a t-shirt!");
		}
		else if (temperature > 60 && suncondition == "Sunny") {
			System.out.println("Cold weather, wear warmer clothes");
			System.out.println("Wear some sunglasses");
		}
		else if (temperature > 50 || suncondition == "Overcast")
			System.out.println("Cold weather, wear warmer clothes");
		else {
			System.out.println("It's icey! Bring an extra jersey.");
		}
		System.out.println("The program is ending");
	}
}
