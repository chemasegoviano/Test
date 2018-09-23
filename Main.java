import java.io.*;
import twitter4j.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter archivo = null;
		PrintWriter pw = null;
		try {
			System.out.println("Empezamos");
			archivo = new FileWriter("tweets.csv", true);
			pw = new PrintWriter(archivo);
			String str = "hola";
			pw.println(str);
			System.out.println("terimnamos");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (null != archivo)
				archivo.close();
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}