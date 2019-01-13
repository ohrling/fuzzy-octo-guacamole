class PersonRegisterAppMain{

public static void main(String[]args){
PersonClass kalle = new PersonClass("Kalle kalleson", 64);

PersonClass berit  = new PersonClass("Berit Beritsson", 24);

PersonClass steffo = new PersonClass("Steffo Törnquist", 63);

System.out.println(kalle.toString());
System.out.println(berit.toString());
System.out.println(steffo.toString());
}

}
