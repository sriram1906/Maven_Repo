package Maven_Test.Maven_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	String username = "dom_batch";
		String Password = "dom_batch";
	
		int rec_count = 0;
		String url = "jdbc:oracle:thin:@gcedb-qa07.billmelater.com:1521:gpnqgc07"; 
		Statement stmt = null;
		String s = "";
		int record_found = 0;
		
		Properties props = new Properties();
	    props.setProperty("user", username);
	    props.setProperty("password", Password);
	    Connection conn = DriverManager.getConnection(url,props);
	    stmt = conn.createStatement();
	    
/*------------------------Querying T_STLMNT_BANK_RCVD to determine the sequence for file name------------*/    
	    
	    String sql4 = "select * from dom_stlmnt.T_STLMNT_BANK_RCVD where trunc(ins_date) = trunc(sysdate) order by 1 desc";
	    ResultSet rs1 = null;
	    rs1 = stmt.executeQuery(sql4);
	    while(rs1.next())
	    {
	    	rec_count = rec_count + 1;
	    }
	    System.out.println(rec_count);
	    rs1.close();
	    conn.close();

    }
}
