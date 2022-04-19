//Anthony Vigil
class Monkey extends RescueAnimal {
	//Set Variables
	private String species, tailLength, height, bodyLength;
	
	public Monkey() {}
	
	//Set Variables
	public Monkey(String n, String g, String a, String w, String s, String tail, String h, String b, String acDate, String acCoun, String train, boolean r, String sc) {
		super();
		super.setName(n);;
		super.setAnimalType("Monkey");
		super.setGender(g);
		super.setAge(a);
		super.setWeight(w);
		super.setAcquisitionDate(acCoun);
		super.setTrainingStatus(train);
		super.setReserved(r);
		super.setInServiceCountry(sc);
		
		this.species = s;
		this.tailLength = tail;
		this.height = h;
		this.bodyLength = b;
	}
	
	//Gets Values
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(String monkeyTailLength) {
		tailLength = monkeyTailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
	}
}