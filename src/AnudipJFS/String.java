package AnudipJFS;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String txt = "Anudip Foudation Bangalore 510510";
		
		System.out.println(txt);
		System.out.println("The length of the text string is:"+ txt.length());
		//length of the string
		
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		System.out.println(txt.indexOf("Bangalore")); // Outputs 17
	}

}
