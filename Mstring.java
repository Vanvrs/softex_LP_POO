package Manipulacao_strin;

public class Mstring {

	public static void main(String[] args) {
		String x = "Ola Softex, essa � a nova aluna.";
		System.out.println(x.length());
		System.out.println(x);
		System.out.println(x + " Se chama Vanessa e est� estudando FrontEnd.");
		System.out.println(x.contains("aluna"));
		System.out.println(x.indexOf("aluna"));
		System.out.println(x.toUpperCase());
		
		String tech = "FrontEnd";
		System.out.println(x.length());
		System.out.println(tech);
		System.out.println(tech + " e BackEnd s�o top.");
		System.out.println(tech.contains("top"));
		System.out.println(tech.indexOf("top"));
		System.out.println(tech.toUpperCase());
		
		String praia = "Porto de Galinha";
		System.out.println(praia.length());
		System.out.println(praia);
		System.out.println(praia + " � uma praia tur�stica do Litoral Sul de PE.");
		System.out.println(praia.contains("Litoral"));
		System.out.println(praia.indexOf("Litoral"));
		System.out.println(praia.toUpperCase());
	}

}
