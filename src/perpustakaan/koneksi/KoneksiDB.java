package perpustakaan.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {

    private static Connection koneksi;

    public static Connection getConnection() {
        try {
            if (koneksi == null) {
                String url = "jdbc:mysql://localhost:3306/perpustakaan";
                String user = "root";
                String password = "123";

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi database berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }

        return koneksi;
    }
}
