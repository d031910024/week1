//Author:ALIAH SIDDIQAH
public class Aquirium {
	public int lenght, height, width;

	public void fillFish() {
		Fish fish1 = new Fish();
		//fish1.color = "green";
		

		fish1.SetColor("greem"); 

		System.out.println("Many "+ fish1.GetColor() + " fish here");

		fish1.Swim();
	}

}
