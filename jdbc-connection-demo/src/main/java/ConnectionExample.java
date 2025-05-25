import oracle.jdbc.OracleConnection;

import java.sql.DriverManager;

public class ConnectionExample {
    public static void main(String[] args) throws Exception {
        // the opaque identifier of a Database Tools connection to be used at runtime
        var dbtoolsConnectionId = "ocid1.databasetoolsconnection.oc1.phx.yourconnectionocid";

        // a JDBC url using the new config-ocidbtools provider
        var url = "jdbc:oracle:thin:@config-ocidbtools://" + dbtoolsConnectionId;

        // nothing should be hard-coded and we are using mTLS
        try (var conn = (OracleConnection) DriverManager.getConnection(url)) {
            System.out.println("Connected to the database");
            System.out.println("Connection URL: " + conn.getMetaData().getURL());
            System.out.println("Connection User: " + conn.getMetaData().getUserName());
            System.out.println("Connection TLS: " + conn.getEncryptionAlgorithmName());
        }
    }
}
