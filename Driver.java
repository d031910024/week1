//Author: aliah siddiqah

public class Driver{
	
	//Attribute or data meber of fields
	public static void main (String [] org) {
		//Fish actually is a data type
		//Fish nemo; == int x; whatever lepas perkataan new panggil balik class tu and kurungan
		Fish nemo = new Fish(); //nemo adalah objecr, Fish adalah kelas
		nemo.Swim(); //kena memalui object baru boleh
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red"); //change here
		nemo.Swim();



		//nemo.Eat(); // superclass call subclass method -not possible




		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();










		//Fish dory = new Fish(); //another object
		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("yellow"); //change here 
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();



	}

	

	}
