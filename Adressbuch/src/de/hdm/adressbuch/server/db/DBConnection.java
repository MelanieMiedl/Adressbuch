package de.hdm.adressbuch.server.db;

import java.sql.Connection;
import java.sql.DriverManager;

//import com.google.appengine.api.utils.SystemProperty;

/**
 * Klasse fuer den Aufbau für die Datenbankverbindung mittels JDBC.
 * @author mmied
 *
 */

public class DBConnection {

	private static Connection con = null;
	private static String googleUrl = "jdbc:google:mysql://itpss18sontact:sontactinstanz/sontactdb";

	private static String localUrl = "jdbc:mysql://localhost:8889/sontact4?user=hallo&password=hallo";
	private static final String testUrl = "jdbc:mysql://localhost:3306/sontact";

	private static final String username = "";
	private static final String password = "eminem";

	/**
	 * Diese Methode gibt die aufgebaute DB-Verbindung zurueck
	 * 
	 * @return con
	 */
	public static Connection connection() {

		String user = "";
		String pass = "";

		/**
		 * Wenn es bisher keine Connection zur DB gab, ...
		 */
		if (con == null) {
			String url = null;
			try {

				if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
					/**
					 * Load the class that provides the new "jdbc:google:mysql://" prefix.
					 */
					Class.forName("com.mysql.jdbc.GoogleDriver");
					url = googleUrl;
					user = username;
					pass = password;

				} else {

					/**
					 * Local MySQL instance to use during development.
					 */
					Class.forName("com.mysql.jdbc.Driver");
					url = testUrl;
;
					user = "MelanieM";
					pass = "Melanie";

				}

				/**
				 * Dann erst kann uns der DriverManager eine Verbindung mit den oben in der
				 * Variable url angegebenen Verbindungsinformationen aufbauen.
				 * 
				 * Diese Verbindung wird dann in der statischen Variable con abgespeichert und
				 * fortan verwendet.
				 */
				con = DriverManager.getConnection(url, user, pass);

				// Absicherung falls die Connection == null ist.
				if (con != null) {

					System.out.println("Die Verbindung ist aktuell:" + con.toString());

				} else {

					System.out.println("Verbindung ist null.");

				}

				/**
				 * con = (Connection) DriverManager.getConnection(googleUrl);
				 */
			} catch (Exception e) {
				con = null;
				e.printStackTrace();
				throw new RuntimeException("Das hat nicht funktioniert!" + e.getMessage().toString()
						+ "Versuchte Infos: " + user + ", " + pass + ", " + url);

			}
		}

		/**
		 * Zurueckgegeben der Verbindung
		 */
		return con;
	}
}
